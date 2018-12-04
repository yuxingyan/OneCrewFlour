package cn.com.action;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.biz.UserBiz;
import cn.com.dao.PageDao;
import cn.com.pojo.Page;
import cn.com.pojo.User;


@Controller("userAction")
public class UserAction extends ActionSupport  {
	/*int topage;
	public int getTopage() {
		return topage;
	}
	public void setTopage(int topage) {
		this.topage = topage;
	}*/

	private int currentPage = 0; // 从jsp页面获取当前页数
	
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}


	@Resource(name="user")
	private User user;
	@Resource(name="userDao")
	private UserBiz userBiz;

    public String login(){
		
		String result="error";
		User user1=userBiz.login(user.getUsername(), user.getPassword());
		if(user1 !=null){
			List<User> list = userBiz.findAll();
			if(list!=null){	
			ServletActionContext.getRequest().getSession().setAttribute("list", list);
			
			result="success";
			}
		}else{
			ServletActionContext.getRequest().setAttribute("error", "error");
			result="error";
		}
		return result;
	}
 public String userlogin(){
		
		String result="error";
		
		
	List<User> list = userBiz.findAll();
		
//			ServletActionContext.getRequest().getSession().setAttribute("list", list);
//			
//			result="success";
//		
//		
//		return result;
//		
	Page page = PageDao.createPage(3, list.size(), currentPage);
	int endIndex = page.getBeginIndex() + page.getEveryPage();
	if ((page.getBeginIndex() + page.getEveryPage()) >= page.getTotalCount()) {
		endIndex = page.getTotalCount();
	}

	list = list.subList(page.getBeginIndex(), endIndex);

	ServletActionContext.getRequest().setAttribute("page", page);
	ServletActionContext.getRequest().getSession().setAttribute("list", list);
	result="success";
	return result;

	}
 

 
    public String adduser(){
    	String result="error";
    	user.setPassword("123456");
    	Date date = new Date();
		Timestamp nousedate = new Timestamp(date.getTime());
		user.setTime(nousedate);
    	User user2=userBiz.adduser(user);
    	if(user2 !=null){
			List<User> list = userBiz.findAll();
			if(list!=null){
			ServletActionContext.getRequest().getSession().setAttribute("list", list);
			result="addsuccess";
			}
		}else{
			ServletActionContext.getRequest().setAttribute("error", "error");
			result="adderror";
		}
		return result;
    	
    }
    public String deleteuser() {
    
	
    	Integer id= Integer.valueOf(ServletActionContext.getRequest().getParameter("movebox"));
		String i = userBiz.deleteuser(id);
		
		if(i=="success"){
			List<User> list = userBiz.findAll();
			ServletActionContext.getRequest().getSession().setAttribute("list", list);
			return "deletesuccess";
			
		}
		else{
			
			return"deleteerror";
		}
		//判断是否删除成功
	
		
    }
    public String modifyuser(){
    	String result="error";
    	User user2=userBiz.findById(user.getUserid());
    
    	if(user2.getPassword().equals(user.getPassword())){
    		
    		if(ServletActionContext.getRequest().getParameter("newpwd").equals(ServletActionContext.getRequest().getParameter("newpwd1"))){
    			
    		userBiz.update(user.getUserid(),user.getUsername(),user.getName(),user.getPhone(),ServletActionContext.getRequest().getParameter("newpwd"));
    		List<User> list = userBiz.findAll();
    		ServletActionContext.getRequest().getSession().setAttribute("list", list);
			result="modifysuccess";
    		}else{
    			ServletActionContext.getRequest().setAttribute("error", "error");
    			result="modifyerror";
    		}
    	}else{
    		ServletActionContext.getRequest().setAttribute("error", "error");
			result="modifyerror";
    	}
    	
    	return result;
    }
    public String passmodify(){
    	String result="error";
    	
    	Integer id= Integer.valueOf(ServletActionContext.getRequest().getParameter("modify"));
    	
		User user2=userBiz.findById(id);
		if(user2!=null){
			ServletActionContext.getRequest().getSession().setAttribute("list", user2);
			result="passsuccess";
		}
		else{
			result="passerror";
		}
		return result;
    	
    }
   /* public String goodp(){
    	int maxsize=0;
    	User g=new User();
    	List goods=new ArrayList();
    	List <User> l=userBiz.findAll();
    	
    	if(l.size()%5==0){
    		maxsize=l.size()/5;	
    	}
    	else{
    		maxsize=l.size()/5+1;
    	}
    	//System.out.println("总页数"+maxsize);
    	int first=(topage-1)*5;//那一夜的第一个
    	if(first+4<l.size()){
    	for(int i=first;i<=first+4;i++){
    		g=(User)l.get(i);
    //System.out.print(a.getRealName());
    		goods.add(g);
    		ServletActionContext.getRequest().setAttribute("user",goods);
    }
    }
    else{
    	for(int i=first;i<l.size();i++){
    		 g=(User) l.get(i);
    		//System.out.print(a.getRealName());
    		goods.add(g);
    		System.out.println(goods.size());
    		ServletActionContext.getRequest().setAttribute("user",goods);
    	}
    }
    //System.out.println("要看的页数为"+topage);
    ServletActionContext.getRequest().setAttribute("showpage",topage);
    ServletActionContext.getRequest().setAttribute("topage", topage);
    ServletActionContext.getRequest().setAttribute("maxpage",maxsize);
    return "pagesuccess";
    }
    */

//    public String showAll() {
//		List<User> list = userBiz.findAll();
//		String 	result="error";
//		// if(list != null && list.size() > 0){
//		// ServletActionContext.getRequest().setAttribute("appusersList", list);
//		// return "appusers";
//		// }else{
//		// return "nodata";
//		// }
//		Page page = PageDao.createPage(3, list.size(), currentPage);
//		int endIndex = page.getBeginIndex() + page.getEveryPage();
//		if ((page.getBeginIndex() + page.getEveryPage()) >= page
//				.getTotalCount()) {
//			endIndex = page.getTotalCount();
//		}
//
//		list = list.subList(page.getBeginIndex(), endIndex);
//
//		ServletActionContext.getRequest().setAttribute("page", page);
//		ServletActionContext.getRequest().setAttribute("appusersList", list);
//		result="success";
//		return result;
//	}

	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {

	 }


}

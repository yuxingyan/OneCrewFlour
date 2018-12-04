package cn.com.action;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.biz.ClientBiz;
import cn.com.biz.ClientstoreBiz;
import cn.com.pojo.Client;
import cn.com.pojo.Clientstore;
@Controller("clientAction")
public class ClientAction extends ActionSupport {
	@Resource(name="clientstoreDao")
	private ClientstoreBiz clientstoreBiz;
	@Resource(name="client")
	private Client client;
	@Resource(name="clientDao")
	private ClientBiz clientBiz;
    public String login(){
		
		String result="error";
		List<Client> list =clientBiz.findAll();
		
			
				System.out.println(list.size());
			ServletActionContext.getRequest().getSession().setAttribute("list", list);
			result="success";
		
			
			
		
		return result;
	}
    public String otherinquireclient(){
    	String result="error";
    	
    	if(ServletActionContext.getRequest().getParameter("check").equals("id")){
    		
    		 String s1=ServletActionContext.getRequest().getParameter("input");
    		 
 	        int clientid=Integer.parseInt(s1);
 	    
		Client client2 =clientBiz.findById(clientid);
		
		if(client2!=null){	
			
			Clientstore clientstore=clientstoreBiz.findByIdType(clientid, "小麦");
			
			ServletActionContext.getRequest().getSession().setAttribute("w", clientstore.getWeight());
			ServletActionContext.getRequest().getSession().setAttribute("list", client2);
			result="otherinquiresuccess";
			}
		else{
			ServletActionContext.getRequest().setAttribute("error", "无满足条件的客户");
			result="otherinquireerror";
		}
	
    	}
    	if(ServletActionContext.getRequest().getParameter("check").equals("all")){
    		
    		List<Client> client2=clientBiz.findAll();
    		
    		if(client2!=null){	
    			for(int i=0;i<client2.size();i++){
    			Clientstore clientstore=clientstoreBiz.findByIdType(client2.get(i).getClientid(), "小麦");
    			ServletActionContext.getRequest().getSession().setAttribute("w", clientstore.getWeight());
    			}
    			ServletActionContext.getRequest().getSession().setAttribute("list", client2);
    			result="otherinquiresuccess";
    			}
    		else{
    			ServletActionContext.getRequest().setAttribute("error", "无满足条件的客户");
    			result="otherinquireerror";
    		}
    	}
    	if(ServletActionContext.getRequest().getParameter("check").equals("name")){
    		
    		Client client2=clientBiz.findByName(ServletActionContext.getRequest().getParameter("input"));
    		
    		if(client2!=null){	
    			
    			Clientstore clientstore=clientstoreBiz.findByIdType(client2.getClientid(), "小麦");
    			
    			ServletActionContext.getRequest().getSession().setAttribute("w", clientstore.getWeight());
    			ServletActionContext.getRequest().getSession().setAttribute("list", client2);
    			result="otherinquiresuccess";
    			}
    		else{
    			ServletActionContext.getRequest().setAttribute("error", "无满足条件的客户");
    			result="otherinquireerror";
    		}
    	}

		return result;
    }
    public String inquireclient(){
    	String result="error";
    	
    	if(ServletActionContext.getRequest().getParameter("check").equals("id")){
    		
    		 String s1=ServletActionContext.getRequest().getParameter("input");
    	
 	        int clientid=Integer.parseInt(s1);
 	       
		Client client2 =clientBiz.findById(clientid);
	
		if(client2!=null){	
			
			Clientstore clientstore=clientstoreBiz.findByIdType(clientid, "小麦");
			
			ServletActionContext.getRequest().getSession().setAttribute("w", clientstore.getWeight());
			System.out.println(clientstore.getWeight());
			ServletActionContext.getRequest().getSession().setAttribute("list", client2);
			result="inquiresuccess";
			}
		else{
			ServletActionContext.getRequest().setAttribute("error", "无满足条件的客户");
			result="inquireerror";
		}
	
    	}
    	if(ServletActionContext.getRequest().getParameter("check").equals("all")){
    		
    		List<Client> client2=clientBiz.findAll();
    		
    		if(client2!=null){	
    			for(int i=0;i<client2.size();i++){
    			Clientstore clientstore=clientstoreBiz.findByIdType(client2.get(i).getClientid(), "小麦");
    			ServletActionContext.getRequest().getSession().setAttribute("w", clientstore.getWeight());
    			}
    			ServletActionContext.getRequest().getSession().setAttribute("list", client2);
    			result="inquiresuccess";
    			}
    		else{
    			ServletActionContext.getRequest().setAttribute("error", "error");
    			result="inquireerror";
    		}
    	}
    	if(ServletActionContext.getRequest().getParameter("check").equals("name")){
    		
    		Client client2=clientBiz.findByName(ServletActionContext.getRequest().getParameter("input"));
    		if(client2!=null){	
    			
    			Clientstore clientstore=clientstoreBiz.findByIdType(client2.getClientid(), "小麦");
    			
    			ServletActionContext.getRequest().getSession().setAttribute("w", clientstore.getWeight());
    			ServletActionContext.getRequest().getSession().setAttribute("list", client2);
    			result="inquiresuccess";
    			}
    		else{
    			ServletActionContext.getRequest().setAttribute("error", "error");
    			result="inquireerror";
    		}
    	}

		return result;
    }
    public String deleteclient() {
        
    	
    	Integer id= Integer.valueOf(ServletActionContext.getRequest().getParameter("movebox"));
		String i = clientBiz.deleteclient(id);
		
		if(i=="success"){
			List<Client> list = clientBiz.findAll();
			ServletActionContext.getRequest().getSession().setAttribute("list", list);
			return "deleteclientsuccess";
			
		}
		else{
			
			return"deleteclienterror";
		}
		//判断是否删除成功
	
		
    }
    public String modifyclient(){
    	String result="error";
    	Client client2=clientBiz.findById(client.getClientid());
    
    	
    			
    		clientBiz.update(client.getClientid(),client.getClientname(),client.getAddress(),client.getIdcard(),client.getPhone(),client.getHomephone());
    		List<Client> list = clientBiz.findAll();
    		ServletActionContext.getRequest().getSession().setAttribute("list", list);
			result="modifyclientsuccess";
    		
    			
    		
    	
    	return result;
    }
    public String passmodifyclient(){
    	String result="error";
    	
    	Integer id= Integer.valueOf(ServletActionContext.getRequest().getParameter("modify"));
    	
		Client client2=clientBiz.findById(id);
		if(client2!=null){
			ServletActionContext.getRequest().getSession().setAttribute("list", client2);
			result="passclientsuccess";
		}
		else{
			result="passclienterror";
		}
		return result;
    	
    }
  
	public String addclient(){
		String result="error";
		Date date = new Date();
		Timestamp nousedate = new Timestamp(date.getTime());
		client.setRectime(nousedate);
    
    	Client client2=clientBiz.addclient(client);
    	if(client2 !=null){
			List<Client> list = clientBiz.findAll();
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



	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

}

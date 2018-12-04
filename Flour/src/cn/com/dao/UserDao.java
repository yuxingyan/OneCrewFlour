package cn.com.dao;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.biz.UserBiz;
import cn.com.pojo.User;
import cn.com.services.BaseDao;

@Repository("userDao")
public class UserDao extends BaseDao implements UserBiz {
	public List<User> findAll() {
		String hql = "from User";
		List list = super.find(hql);
		if (list !=null && list.size()>0) {
			return list;
		} else {
			return list;
		}
	}

	public User login(String name, String pwd) {
		// TODO Auto-generated method stub
		String hql="from User where username='"+name+"' and password='"+pwd+"'";
	   List list=super.find(hql);
		
		if(list !=null && list.size()>0){
			
			User user=(User)list.get(0);
			return user;
			
		}else{
			return null;
		}
		
		
	}
		
		
	
	public User adduser(User user){
        int l=0;
        int flag=0;
        List<User> list=this.findAll();
        for(int i=0;i<list.size();i++){
        	
        	if(user.getUsername().equals(list.get(i).getUsername())){
        	
        		flag=1;
        		break;
        	}
        }
        if(flag==0){
		 l=super.save(user);
        }
		if(l==1){
			
		return user;
			
		}
		else{
		return null;
		}
	}
	public User findById(int userid) {
		String hql = "from User u where u.userid = "+userid+"";
		List list = super.find(hql);
		if (list !=null && list.size()>0) {
			return (User) list.get(0);
		} else {
			User user=new User();
			return user;
		}
	}
	public User findByName(String username){
		String hql = "from User u where u.username = "+username+"";
		List list = super.find(hql);
		if (list !=null && list.size()>0) {
			return (User) list.get(0);
		} else {
			User user=new User();
			return user;
		}
	}
	
	public String deleteuser(int userid){
		int d=super.delete(this.findById(userid));
		return "success";
	}
	public void update(int userid,String username,String name,String phone,String newpwd){
		User user=this.findById(userid);
		user.setName(name);
		user.setPassword(newpwd);
		user.setPhone(phone);
		user.setUsername(username);
		this.update(user);
		
		
	}
   // public void modifyuser(int id){
    	//List<User> list=this.findAll();
    	//int flag=0;
    	 // for(int i=0;i<list.size();i++){
          	
          //	if(list.get(i).getUserid()==i){
          	//   flag=1;
          	
        //  		break;
         // 	}
       //   }
    	  
    	
    //}

}

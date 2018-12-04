package cn.com.biz;

import java.util.List;



import cn.com.pojo.User;

public interface UserBiz {
	public User login(String name,String pwd);
	public User adduser(User user);
	List<User> findAll();
	public User findById(int userid);
	public String deleteuser(int userid);
	 //public void modifyuser(int id);
	 public void update(int userid,String username,String name,String phone,String newpwd);
	 public User findByName(String username);
}

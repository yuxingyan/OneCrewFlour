package cn.com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.biz.FlourprocessBiz;
import cn.com.pojo.Process;
import cn.com.services.BaseDao;
@Repository("flourprocessDao")
public class FlourprocessDao extends BaseDao implements FlourprocessBiz {
	public void addflourprocess(Process process,int userid,String type){
	
		  process.setUserid(userid);
		
		  process.setType(type);
		  super.save(process);
	
		
		
	}
public int findcount(){
		
		String hql = "select count(*) from Process p";
		 List  list=super.find(hql);
		 
		
		return list.size();
		
	}

	
	

}

package cn.com.dao;

import org.springframework.stereotype.Repository;

import cn.com.biz.InstoreBiz;
import cn.com.pojo.Client;
import cn.com.pojo.Instore;
import cn.com.services.BaseDao;
@Repository("instoreDao")
public class InstoreDao extends BaseDao implements InstoreBiz{
	public Instore addinstore(Instore instore){
		
			  int l=0;
			  
				 l=super.save(instore);
				
				if(l==1){
					
				return instore;
					
				}
				else{
				return instore;
				}
	}

}

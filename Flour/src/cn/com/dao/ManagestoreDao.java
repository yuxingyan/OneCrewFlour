package cn.com.dao;

import org.springframework.stereotype.Repository;

import cn.com.biz.ManagestoreBiz;
import cn.com.pojo.Managestore;
import cn.com.services.BaseDao;
@Repository("managestoreDao")
public class ManagestoreDao extends BaseDao implements ManagestoreBiz {
	public void addmanagestore(Managestore managestore){
		super.save(managestore);
		
		
	}

}

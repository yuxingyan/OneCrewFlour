package cn.com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.biz.CheckflourstoreBiz;
import cn.com.pojo.Checkstore;
import cn.com.pojo.Client;
import cn.com.pojo.User;
import cn.com.services.BaseDao;
@Repository("checkflourstoreDao")
public class CheckflourstoreDao extends BaseDao implements CheckflourstoreBiz {
	public void addcheckflouestore(Checkstore checkstore){
		super.save(checkstore);
		
	}
	public void updatecheckflouestore(Checkstore checkstore){
		super.update(checkstore);
	}
	public Checkstore findByName(String type) {
		String hql = "from Checkstore c where c.type like '%"+type+"%'";
		List list = super.find(hql);
		if (list !=null && list.size()>0) {
			return (Checkstore) list.get(0);
		} else {
			Checkstore checkstore=new Checkstore();
			return checkstore;
		}
	}
	public List<Checkstore> findAll() {
		String hql = "from Checkstore";
		List list = super.find(hql);
		if (list !=null && list.size()>0) {
			return list;
		} else {
			return list;
		}
	}

}

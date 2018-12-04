package cn.com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.biz.ChangeBiz;
import cn.com.pojo.Change;
import cn.com.pojo.Client;
import cn.com.services.BaseDao;
@Repository("changeDao")
public class ChangeDao extends BaseDao implements ChangeBiz {
	public void addchange(Change change){
		super.save(change);
		
		
	}
	public List<Change> findAll() {
		String hql = "from Change";
		List list = super.find(hql);
		if (list !=null && list.size()>0) {
			return list;
		} else {
			return list;
		}
		
	}
	


}

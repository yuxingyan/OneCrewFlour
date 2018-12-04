package cn.com.dao;


import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.biz.InquireBiz;
import cn.com.pojo.Buy;
import cn.com.pojo.Instore;
import cn.com.pojo.Managestore;
import cn.com.pojo.Sale;
import cn.com.pojo.Useflour;
import cn.com.services.BaseDao;
@Repository("inquireDao")
public class InquireDao extends BaseDao implements InquireBiz {
	public List instore(String d1,String d2){
		
		String hql = "from Instore i where i.date between FORMAT('"+d1+"','yyyy-mm-dd') "
				+ "and FORMAT('"+d2+"','yyyy-mm-dd')";
		
	
		List<Instore> list=super.find(hql);
		
		return list;
	}
	public List useflour(String d1,String d2){
		String hql="from Useflour i where i.date between FORMAT('"+d1+"','yyyy-mm-dd') "
				+ "and FORMAT('"+d2+"','yyyy-mm-dd')";
		List<Useflour> list=super.find(hql);
		return list;
	}
	public List process(String d1,String d2){
		String hql="from Process i where i.date between FORMAT('"+d1+"','yyyy-mm-dd') "
				+ "and FORMAT('"+d2+"','yyyy-mm-dd')";
		List<Process> list=super.find(hql);
		return list;
	}
	public List managestore(String d1,String d2){
		String hql="from Managestore i where i.date between FORMAT('"+d1+"','yyyy-mm-dd') "
				+ "and FORMAT('"+d2+"','yyyy-mm-dd')";
		List<Managestore> list=super.find(hql);
		return list;
	}
	public List buy(String d1,String d2){
		String hql="from Buy i where i.date between FORMAT('"+d1+"','yyyy-mm-dd') "
				+ "and FORMAT('"+d2+"','yyyy-mm-dd')";
		List<Buy> list=super.find(hql);
		return list;
	}
	public List sale(String d1,String d2){
		String hql="from Sale i where i.date between FORMAT('"+d1+"','yyyy-mm-dd') "
				+ "and FORMAT('"+d2+"','yyyy-mm-dd')";
		List<Sale> list=super.find(hql);
		return list;
	}
	
	

}

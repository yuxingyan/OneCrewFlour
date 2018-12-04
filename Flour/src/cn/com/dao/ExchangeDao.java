package cn.com.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.biz.ExchangeBiz;
import cn.com.pojo.Exchange;
import cn.com.services.BaseDao;
@Repository("exchangeDao")
public class ExchangeDao extends BaseDao implements ExchangeBiz {
	public int findcount(){
		String hql="select IFNULL(MAX(eid),0)+1 from Exchange";
		
		
		 List  list=super.find(hql);
		 
		// String s = list.get(0).toString();
		 
			//int num = Integer.parseInt(s);
		 int num=(int) list.get(0);
		
			return num;
		
		
		
	}

	public Exchange addexchange(Integer eid,String exchangetype,int clientid,Date date,Float pay,Boolean deficit,Float realpay,int userid ){
		
		Exchange exchange = new Exchange();
		
		exchange.setEid(eid);
		
		exchange.setExchangetype(exchangetype);
		
		exchange.setClientid(clientid);
		
		exchange.setDate(date);
		
		exchange.setDeficit(deficit);
	
		exchange.setPay(pay);
		exchange.setRealpay(realpay);
		exchange.setUserid(userid);
	
		this.save(exchange);
		
		return exchange;
	}

}

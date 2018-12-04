package cn.com.dao;

import org.springframework.stereotype.Repository;

import cn.com.biz.SaleBiz;
import cn.com.pojo.Sale;
import cn.com.services.BaseDao;
@Repository("saleDao")
public class SaleDao extends BaseDao implements SaleBiz {
	public void addsale(Sale sale){
		super.save(sale);
		
	}

}

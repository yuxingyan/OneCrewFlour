package cn.com.dao;

import org.springframework.stereotype.Repository;

import cn.com.biz.BuyBiz;
import cn.com.pojo.Buy;
import cn.com.services.BaseDao;
@Repository("buyDao")
public class BuyDao extends BaseDao implements BuyBiz {

		public Buy addbuy(Buy buy){
			
			  int l=0;
			     
				 l=super.save(buy);
				
				if(l==1){
					
				return buy;
					
				}
				else{
				return buy;
				}
		}

}

package cn.com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.biz.ProductBiz;
import cn.com.pojo.Client;
import cn.com.pojo.Product;
import cn.com.pojo.User;
import cn.com.services.BaseDao;
@Repository("productDao")
public class ProductDao extends BaseDao implements ProductBiz {
	public Product addproduct(Product product){
		  int l=0;
		  int flag=0;
	        List<Product> list=this.findAll();
	        for(int i=0;i<list.size();i++){
	        	
	        	if(product.getTypename().equals(list.get(i).getTypename())){
	        	
	        		flag=1;
	        		break;
	        	}
	        }
	        if(flag==0){
			 l=super.save(product);
	        }
			 
			 
			if(l==1){
				
			return product;
				
			}
			else{
			return null;
			}
	
	

}
	
	public String deleteproduct(int typeid){
		int d=super.delete(this.findById(typeid));
		return "success";
	}
	public List<Product> findAll() {
		String hql = "from Product";
		List list = super.find(hql);
		if (list !=null && list.size()>0) {
			return list;
		} else {
			return list;
		}
	}
	public void update(int typeid,String typename,String note){
		Product product=this.findById(typeid);
		product.setNote(note);
		product.setTypename(typename);
		this.update(product);
		
		
		
	}
	
	public Product findById(int productid) {
		String hql = "from Product p where p.typeid = "+productid+"";
		List list = super.find(hql);
		if (list !=null && list.size()>0) {
			return (Product) list.get(0);
		} else {
			Product product=new Product();
			return product;
		}
	}
}
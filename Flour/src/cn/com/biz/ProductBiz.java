package cn.com.biz;

import java.util.List;

import cn.com.pojo.Product;

public interface ProductBiz {
	public Product addproduct(Product product);
	public List<Product> findAll();
	public Product findById(int productid);
	public void update(int typeid,String typename,String note);
	public String deleteproduct(int typeid);
}

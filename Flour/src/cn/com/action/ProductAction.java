package cn.com.action;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.biz.ProductBiz;
import cn.com.pojo.Client;
import cn.com.pojo.Product;
import cn.com.pojo.User;
@Controller("productAction")
public class ProductAction extends ActionSupport {
	@Resource(name="product")
	private Product product;
	@Resource(name="productDao")
	private ProductBiz productBiz;
	  public String login(){
			
			String result="error";
			List<Product> list =productBiz.findAll();
			
				
			
				ServletActionContext.getRequest().getSession().setAttribute("list", list);
				result="success";
		
			return result;
		}
	  public String deleteproduct() {
		    
			
	    	Integer id= Integer.valueOf(ServletActionContext.getRequest().getParameter("movebox"));
			String i = productBiz.deleteproduct(id);
			
			if(i=="success"){
				List<Product> list = productBiz.findAll();
				ServletActionContext.getRequest().getSession().setAttribute("list", list);
				return "deleteproductsuccess";
				
			}
			else{
				
				return"deleteproducterror";
			}

	    }
	public String addproduct(){
		String result="error";
    	
    	
    	Product product2=productBiz.addproduct(product);
    	if(product2 !=null){
			List<Product> list = productBiz.findAll();
			if(list!=null){
				
			ServletActionContext.getRequest().getSession().setAttribute("list", list);
			result="addsuccess";
			}
		}else{
			ServletActionContext.getRequest().setAttribute("error", "error");
			result="adderror";
		}
		return result;
	}
	  public String passmodifyproduct(){
	    	String result="error";
	    	
	    	Integer id= Integer.valueOf(ServletActionContext.getRequest().getParameter("modify"));
	    	
			Product product2=productBiz.findById(id);
			if(product2!=null){
				ServletActionContext.getRequest().getSession().setAttribute("list", product2);
				result="passproductsuccess";
			}
			else{
				result="passproducterror";
			}
			return result;
	    	
	    }
	  public String modifyproduct(){
	    	String result="error";
	    	Product product2=productBiz.findById(product.getTypeid());
	    
	    	
	    			
	    		productBiz.update(product.getTypeid(),product.getTypename(),product.getNote());
	    		List<Product> list = productBiz.findAll();
	    		ServletActionContext.getRequest().getSession().setAttribute("list", list);
				result="modifyproductsuccess";
	    	
	    	
	    	return result;
	    }
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

}
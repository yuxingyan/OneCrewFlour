package cn.com.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.biz.ChangeBiz;
import cn.com.biz.CheckflourstoreBiz;
import cn.com.biz.ClientBiz;
import cn.com.biz.ClientstoreBiz;
import cn.com.biz.ExchangeBiz;
import cn.com.biz.FlourstoreBiz;
import cn.com.biz.ProductBiz;
import cn.com.biz.SaleBiz;
import cn.com.pojo.Change;
import cn.com.pojo.Checkstore;
import cn.com.pojo.Clientstore;
import cn.com.pojo.Flourstore;
import cn.com.pojo.Product;
import cn.com.pojo.Sale;
@Controller("saleAction")
public class SaleAction extends ActionSupport {
	@Resource(name="checkflourstoreDao")
	private CheckflourstoreBiz checkflourstoreBiz;
	@Resource(name="sale")
	private Sale sale;
	public Sale getSale() {
		return sale;
	}
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	@Resource(name="clientDao")
	private ClientBiz clientBiz;
	@Resource(name="changeDao")
	private ChangeBiz changeBiz;
	@Resource(name="flourstoreDao")
	private FlourstoreBiz flourstoreBiz;
	@Resource(name="saleDao")
	private SaleBiz saleBiz;
	@Resource(name="clientstoreDao")
	private ClientstoreBiz clientstoreBiz;
	@Resource(name="exchangeDao")
	private ExchangeBiz exchangeBiz;
	@Resource(name="productDao")
	private ProductBiz productBiz;
	public String init(){
		String result="error";
int count=exchangeBiz.findcount();
		
		ServletActionContext.getRequest().getSession().setAttribute("count", count);
		List<Flourstore> flour=flourstoreBiz.findAll();
	    
			
			ServletActionContext.getRequest().getSession().setAttribute("list", flour);
			
			result="initsuccess";
	  
		return result;
		
	}
	public String addsale() throws ParseException{
		String result="error";
Change change=new Change();
		
		
		 String s0=ServletActionContext.getRequest().getParameter("bian");
			
			int clientid=Integer.parseInt(s0);
			String s1=ServletActionContext.getRequest().getParameter("sale.date");
			DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd"); 
			Date date = format1.parse(s1);
			 String s2=ServletActionContext.getRequest().getParameter("pay");
				
				Float pay=Float.valueOf(s2).floatValue();
				String s3=ServletActionContext.getRequest().getParameter("realpay");
					
				Float realpay=Float.valueOf(s3).floatValue();
				String s4=ServletActionContext.getRequest().getParameter("option");
				
			sale.setDate(date);
			sale.setClientid(clientid);
			sale.setType(s4);
			Clientstore clientstore=clientstoreBiz.findByIdType(clientid, s4);
			change.setClientid(clientid);
	    	   change.setChangetype("产品销售");
	    	   change.setDate(date);
	    	   change.setClientname(clientBiz.findById(clientid).getClientname());
	    	   change.setClientcard(clientBiz.findById(clientid).getIdcard());
	    	   change.setClientaddress(clientBiz.findById(clientid).getAddress());
	    	   change.setEid(sale.getEid());
	    	   change.setPay1(pay);
	    	   change.setRealpay1(realpay);
			if(clientstore!=null){
				if(clientstore.getWeight()>sale.getWeight()){
					  if(pay>realpay){
			    		   change.setPay(pay-realpay);
			    		   change.setFlag(2);
			    		   changeBiz.addchange(change);
			    	   }
			    	   if(pay<realpay){
			    		   change.setPay(realpay-pay);
			    		   change.setFlag(1);
			    		   
			    		   changeBiz.addchange(change);
			    	   }
					
					saleBiz.addsale(sale);
					Flourstore flourstore=flourstoreBiz.findByType(s4);
					clientstoreBiz.updateclientstore(clientid, s4, clientstore.getWeight()-sale.getWeight());
					Checkstore checkstore=checkflourstoreBiz.findByName(s4);
					
					 
					   
						checkstore.setClientstore(checkstore.getClientstore()-sale.getWeight());
						checkstore.setSumstore(checkstore.getSumstore()-sale.getWeight());
						
						checkflourstoreBiz.updatecheckflouestore(checkstore);
					if(flourstore!=null){
						flourstoreBiz.updateflourstore(s4, flourstore.getMillweight()+sale.getWeight());
						
					}else{
						flourstoreBiz.addflourstore(s4, sale.getWeight());
					}
					result="addsalesuccess";
				}else{
					result="addsaleerror";
				}
			}
		
		
		return result;
		
	}

}

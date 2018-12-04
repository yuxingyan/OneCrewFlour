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
import cn.com.biz.FlouruseBiz;
import cn.com.biz.ProductBiz;
import cn.com.pojo.Change;
import cn.com.pojo.Checkstore;
import cn.com.pojo.Clientstore;
import cn.com.pojo.Flourstore;
import cn.com.pojo.Product;
import cn.com.pojo.Useflour;
@Controller("flouruseAction")
public class FlouruseAction extends ActionSupport {
	@Resource(name="checkflourstoreDao")
	private CheckflourstoreBiz checkflourstoreBiz;
	@Resource(name="clientDao")
	private ClientBiz clientBiz;
	@Resource(name="changeDao")
	private ChangeBiz changeBiz;
	
	@Resource(name="productDao")
	private ProductBiz productBiz;
	@Resource(name="clientstoreDao")
	private ClientstoreBiz clientstoreBiz;
	@Resource(name="flouruseDao")
	private FlouruseBiz flouruseBiz;
	
	private Useflour useflour;
	
	@Resource(name="flourstoreDao")
	private FlourstoreBiz flourstoreBiz;
	@Resource(name="exchangeDao")
	private ExchangeBiz exchangeBiz;

	

	

	
	public String init(){
		String result="error";
int count=exchangeBiz.findcount();
		
		ServletActionContext.getRequest().getSession().setAttribute("count", count);
		List<Product> list=productBiz.findAll();
	    if(list!=null){
		
			ServletActionContext.getRequest().setAttribute("list", list);
			
			result="initsuccess";
			
		}else{
			ServletActionContext.getRequest().setAttribute("erroeMsn", "error");
			result="initerror";
		}

		return result;
		
	}
	public String addflouruse() throws ParseException {
		Change change=new Change();
		
	
		String result="error";
		String s0=ServletActionContext.getRequest().getParameter("bian");
		
		int clientid=Integer.parseInt(s0);
        String s2=ServletActionContext.getRequest().getParameter("pay");
		
		Float pay=Float.valueOf(s2).floatValue();
		String s3=ServletActionContext.getRequest().getParameter("realpay");
			
		Float realpay=Float.valueOf(s3).floatValue();
		
		
		
		String s1=ServletActionContext.getRequest().getParameter("useflour.date");
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd"); 
		Date date = format1.parse(s1);
			useflour.setDate(date);
		
		
			String s4=ServletActionContext.getRequest().getParameter("option");
			
		Clientstore clientstore=clientstoreBiz.findByIdType(clientid, "小麦");
	
		Clientstore clientstore1=clientstoreBiz.findByIdType(clientid, s4);
		 Flourstore flourstore=flourstoreBiz.findByType(s4);
		 if(flourstore.getMillweight()!=null){
			 if(flourstore.getMillweight()>useflour.getUweight()){
	
		if(clientstore.getWeight()>useflour.getRawweight()){
			
			useflour.setType(s4);
			 change.setClientid(clientid);
	    	   change.setChangetype("面粉领用");
	    	   change.setDate(date);
	    	   change.setClientname(clientBiz.findById(clientid).getClientname());
	    	   change.setClientcard(clientBiz.findById(clientid).getIdcard());
	    	   change.setClientaddress(clientBiz.findById(clientid).getAddress());
	    	   change.setEid(useflour.getEid());
	    	   change.setPay1(pay);
	    	   change.setRealpay1(realpay);
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
	    	  
			flouruseBiz.addflouruse(useflour);
			flourstoreBiz.updateflourstore(s4, flourstore.getMillweight()-useflour.getUweight());
			clientstoreBiz.updateclientstore(clientid, "小麦", clientstore.getWeight()-useflour.getBranweight());
			
			if(clientstore1.getWeight()!=null){
				
			clientstoreBiz.updateclientstore(clientid, s4, clientstore1.getWeight()+useflour.getUweight());
			
			Checkstore checkstore=checkflourstoreBiz.findByName(s4);
			
		
			checkstore.setSumstore(checkstore.getSumstore());
				checkstore.setClientstore(checkstore.getClientstore()+useflour.getUweight());
				
				
				checkflourstoreBiz.updatecheckflouestore(checkstore);
				
			}
			else{
				clientstoreBiz.addclientstore(clientid, s4, useflour.getUweight());
				
				Checkstore checkstore=checkflourstoreBiz.findByName(s4);
				
				if(checkstore.getSumstore()==null){
					checkstore.setClientstore(useflour.getUweight());
					checkstore.setSumstore(useflour.getUweight());
					checkstore.setType(s4);
					
					checkflourstoreBiz.addcheckflouestore(checkstore);
					
					
				    
				}
				else{
					checkstore.setSumstore(checkstore.getSumstore());
					checkstore.setClientstore(checkstore.getClientstore()+useflour.getUweight());
					
					checkflourstoreBiz.updatecheckflouestore(checkstore);
					
					
				}
			}
			result="addflourusesuccess";
		}
		else{
			result="addflouruseerror";
		}
		 }else{
			 result="addflouruseerror";
		 }}else{
			 result="addflouruseerror";
		 }
		return result;
		
	}
	public Useflour getUseflour() {
		return useflour;
	}
	public void setUseflour(Useflour useflour) {
		this.useflour = useflour;
	}

}

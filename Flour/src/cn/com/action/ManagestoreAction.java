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
import cn.com.biz.ManagestoreBiz;
import cn.com.biz.ProductBiz;
import cn.com.pojo.Change;
import cn.com.pojo.Checkstore;
import cn.com.pojo.Clientstore;
import cn.com.pojo.Flourstore;
import cn.com.pojo.Managestore;
import cn.com.pojo.Product;
@Controller("managestoreAction")
public class ManagestoreAction extends ActionSupport {
	@Resource(name="checkflourstoreDao")
	private CheckflourstoreBiz checkflourstoreBiz;
	@Resource(name="clientDao")
	private ClientBiz clientBiz;
	@Resource(name="changeDao")
	private ChangeBiz changeBiz;
	@Resource(name="managestoreDao")
	private ManagestoreBiz managestoreBiz;
	@Resource(name="flourstoreDao")
	private FlourstoreBiz flourstoreBiz;
	@Resource(name="productDao")
	private ProductBiz productBiz;
	@Resource(name="exchangeDao")
	private ExchangeBiz exchangeBiz;
	@Resource(name="clientstoreDao")
	private ClientstoreBiz clientstoreBiz;
	@Resource(name="managestore")
	private Managestore managestore;
	public Managestore getManagestore() {
		return managestore;
	}
	public void setManagestore(Managestore managestore) {
		this.managestore = managestore;
	}
	public String init(){
		String result="error";
        int count=exchangeBiz.findcount();
		
		ServletActionContext.getRequest().getSession().setAttribute("count", count);
		
	   List<Flourstore> flourstore=flourstoreBiz.findAll();
	   ServletActionContext.getRequest().getSession().setAttribute("list", flourstore);
			
			result="initsuccess";
			
	
			
			
		
		return result;
	}
	public String addmanagestore() throws ParseException{
		String result="error";
        String s0=ServletActionContext.getRequest().getParameter("bian");
        Change change=new Change();
		
		
		int clientid=Integer.parseInt(s0);
		String s1=ServletActionContext.getRequest().getParameter("managestore.date");
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd"); 
		Date date = format1.parse(s1);
		managestore.setDate(date);
		String s4=ServletActionContext.getRequest().getParameter("option");
		String s5=ServletActionContext.getRequest().getParameter("optiontype");
		
		Clientstore clientstore=clientstoreBiz.findByIdType(clientid, s5);
		Flourstore flourstore=flourstoreBiz.findByType(s5);
		managestore.setType(s5);
		managestore.setMethod(s4);
		managestore.setClientid(clientid);
		  String s2=ServletActionContext.getRequest().getParameter("pay");
			
			Float pay=Float.valueOf(s2).floatValue();
			String s3=ServletActionContext.getRequest().getParameter("realpay");
				
			Float realpay=Float.valueOf(s3).floatValue();
			change.setClientid(clientid);
	    	   change.setChangetype("��洦��");
	    	   change.setDate(date);
	    	   change.setClientname(clientBiz.findById(clientid).getClientname());
	    	   change.setClientcard(clientBiz.findById(clientid).getIdcard());
	    	   change.setClientaddress(clientBiz.findById(clientid).getAddress());
	    	   change.setEid(managestore.getEid());
	    	   change.setPay1(pay);
	    	   change.setRealpay1(realpay);
		if(clientstore.getWeight()!=null){
			
			
			if(managestore.getMethod().equals(" "+"����")){
				
			if(managestore.getWeight()<clientstore.getWeight()){
				clientstoreBiz.updateclientstore(clientid, s5, clientstore.getWeight()-managestore.getWeight());
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
				managestoreBiz.addmanagestore(managestore);
				if(flourstore.getMillweight()!=null){
					
					flourstoreBiz.updateflourstore(s5, flourstore.getMillweight()+managestore.getWeight());
					Checkstore checkstore=checkflourstoreBiz.findByName(s5);
					
				 
					   checkstore.setSumstore(checkstore.getSumstore());
						checkstore.setClientstore(checkstore.getClientstore()-managestore.getWeight());
						
						checkflourstoreBiz.updatecheckflouestore(checkstore);
					
				}
				else{
					flourstoreBiz.addflourstore(s5, managestore.getWeight());
					Checkstore checkstore=checkflourstoreBiz.findByName(s5);
					
					 
					   checkstore.setSumstore(checkstore.getSumstore());
						checkstore.setClientstore(checkstore.getClientstore()-managestore.getWeight());
						
						checkflourstoreBiz.updatecheckflouestore(checkstore);
					
				}
				result="addmanagestoresuccess";
			}else{
				result="addmanagestoreerror";
			}
			}else{
				if(flourstore.getMillweight()!=null){
					if(managestore.getWeight()<flourstore.getMillweight()){
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
						
						managestoreBiz.addmanagestore(managestore);
						flourstoreBiz.updateflourstore(s5, flourstore.getMillweight()-managestore.getWeight());
						
						if(clientstore.getWeight()!=null){
							clientstoreBiz.updateclientstore(clientid, s5, clientstore.getWeight()+managestore.getWeight());
							Checkstore checkstore=checkflourstoreBiz.findByName(s5);
							
							 
							   checkstore.setSumstore(checkstore.getSumstore());
								checkstore.setClientstore(checkstore.getClientstore()+managestore.getWeight());
								
								checkflourstoreBiz.updatecheckflouestore(checkstore);
							
						}
						else{
							clientstoreBiz.addclientstore(clientid, s5, managestore.getWeight());
							Checkstore checkstore=checkflourstoreBiz.findByName(s5);
							
							 
							   checkstore.setSumstore(checkstore.getSumstore());
								checkstore.setClientstore(checkstore.getClientstore()-managestore.getWeight());
								
								checkflourstoreBiz.updatecheckflouestore(checkstore);
							
						}
						result="addmanagestoresuccess";
					}else{
						result="addmanagestoreerror";
					}
				}else{
					result="addmanagestoreerror";
				}
			}
		}
		
		
		return result;
	}

}

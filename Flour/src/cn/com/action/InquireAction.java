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

import cn.com.biz.InquireBiz;
import cn.com.pojo.Buy;
import cn.com.pojo.Instore;
import cn.com.pojo.Managestore;
import cn.com.pojo.Sale;
import cn.com.pojo.Useflour;
@Controller("inquireAction")
public class InquireAction extends ActionSupport {
	
	@Resource(name="inquireDao")
	private InquireBiz inquireBiz;
	public String instore() throws ParseException{
		
		String result="error";
		String s1=ServletActionContext.getRequest().getParameter("startdate");
		
		String s2=ServletActionContext.getRequest().getParameter("enddate");
	
		List<Instore> list=inquireBiz.instore(s1, s2);
		if(list!=null){
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		result="instoresuccess";
		
		}else{
			result="instoreerror";
		}
		return result;
	}
	public String useflour() throws ParseException{
		 
		String result="error";
		String s1=ServletActionContext.getRequest().getParameter("startdate");
		
		String s2=ServletActionContext.getRequest().getParameter("enddate");
		
		List<Useflour> list=inquireBiz.useflour(s1, s2);
		if(list!=null){
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		result="usefloursuccess";
		
		}else{
			result="useflourerror";
		}
		return result;
	}
	public String process() throws ParseException{
	
		String result="error";
		String s1=ServletActionContext.getRequest().getParameter("startdate");
		
		String s2=ServletActionContext.getRequest().getParameter("enddate");
		
		List<Process> list=inquireBiz.process(s1, s2);
		if(list!=null){
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		result="processsuccess";
		
		}else{
			result="processerror";
		}
		return result;
	}
	public String managestore() throws ParseException{
		
		String result="error";
		String s1=ServletActionContext.getRequest().getParameter("startdate");
	
		String s2=ServletActionContext.getRequest().getParameter("enddate");
		
		List<Managestore> list=inquireBiz.managestore(s1, s2);
		if(list!=null){
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		result="managestoresuccess";
		
		}else{
			result="managestoreerror";
		}
		return result;
	}
	public String buy() throws ParseException{
		 
		String result="error";
		String s1=ServletActionContext.getRequest().getParameter("startdate");
		
		String s2=ServletActionContext.getRequest().getParameter("enddate");
		
		List<Buy> list=inquireBiz.buy(s1, s2);
		if(list!=null){
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		result="buysuccess";
		
		}else{
			result="buyerror";
		}
		return result;
	}
	public String sale() throws ParseException{
		
		String result="error";
		String s1=ServletActionContext.getRequest().getParameter("startdate");
		
		String s2=ServletActionContext.getRequest().getParameter("enddate");
		
		List<Sale> list=inquireBiz.sale(s1, s2);
		if(list!=null){
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		result="salesuccess";
		
		}else{
			result="saleerror";
		}
		return result;
	}

}

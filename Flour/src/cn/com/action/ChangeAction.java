package cn.com.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.biz.ChangeBiz;
import cn.com.biz.ClientBiz;
import cn.com.pojo.Change;
@Controller("changeAction")
public class ChangeAction extends ActionSupport {
	@Resource(name="changeDao")
	private ChangeBiz changeBiz;
	@Resource(name="clientDao")
	private ClientBiz clientBiz;
	public String init(){
		String result="error";
		List<Change> list=changeBiz.findAll();
		
			
			ServletActionContext.getRequest().getSession().setAttribute("list", list);
			result="initsuccess";
		
		
		return result;
	}
	public String show(){
		String result="error";
		List<Change> list=changeBiz.findAll();
		if(list!=null){	
			
			ServletActionContext.getRequest().getSession().setAttribute("list", list);
			result="showsuccess";
			}
		else{
			ServletActionContext.getRequest().setAttribute("error", "error");
			result="showerror";
		}
		
		return result;
		
	}

}
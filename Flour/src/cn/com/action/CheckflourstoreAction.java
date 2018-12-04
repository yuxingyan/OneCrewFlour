package cn.com.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.biz.CheckflourstoreBiz;
import cn.com.pojo.Checkstore;
@Controller("checkflourstoreAction")
public class CheckflourstoreAction extends ActionSupport {
	@Resource(name="checkflourstoreDao")
	private CheckflourstoreBiz checkflourstoreBiz;
	public String init(){
		String result="error";
		List<Checkstore> list=checkflourstoreBiz.findAll();
		
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		
		result="initsuccess";
		
		return result;
	}

}
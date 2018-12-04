package cn.com.pojo;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * Exchange entity. @author MyEclipse Persistence Tools
 */
@Component("exchange")
public class Exchange implements java.io.Serializable {

	// Fields

	private Integer eid;
	private Integer clientid;
	private Date date;
	private Float pay;
	private Float realpay;
	private Integer userid;
	private String exchangetype;
	private Boolean deficit;

	// Constructors

	/** default constructor */
	public Exchange() {
	}

	/** full constructor */
	public Exchange(Integer clientid, Date date, Float pay, Float realpay, Integer userid, String exchangetype,
			Boolean deficit) {
		this.clientid = clientid;
		this.date = date;
		this.pay = pay;
		this.realpay = realpay;
		this.userid = userid;
		this.exchangetype = exchangetype;
		this.deficit = deficit;
	}

	// Property accessors

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public Integer getClientid() {
		return this.clientid;
	}

	public void setClientid(Integer clientid) {
		this.clientid = clientid;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Float getPay() {
		return this.pay;
	}

	public void setPay(Float pay) {
		this.pay = pay;
	}

	public Float getRealpay() {
		return this.realpay;
	}

	public void setRealpay(Float realpay) {
		this.realpay = realpay;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getExchangetype() {
		return this.exchangetype;
	}

	public void setExchangetype(String exchangetype) {
		this.exchangetype = exchangetype;
	}

	public Boolean getDeficit() {
		return this.deficit;
	}

	public void setDeficit(Boolean deficit) {
		this.deficit = deficit;
	}

}
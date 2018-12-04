package cn.com.pojo;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * Client entity. @author MyEclipse Persistence Tools
 */
@Component("client")
public class Client implements java.io.Serializable {

	// Fields

	private Integer clientid;
	private String clientname;
	private String address;
	private String idcard;
	private String phone;
	private Date rectime;
	private String homephone;

	// Constructors

	/** default constructor */
	public Client() {
	}

	/** full constructor */
	public Client(String clientname, String address, String idcard, String phone, Date rectime, String homephone) {
		this.clientname = clientname;
		this.address = address;
		this.idcard = idcard;
		this.phone = phone;
		this.rectime = rectime;
		this.homephone = homephone;
	}

	// Property accessors

	public Integer getClientid() {
		return this.clientid;
	}

	public void setClientid(Integer clientid) {
		this.clientid = clientid;
	}

	public String getClientname() {
		return this.clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getRectime() {
		return this.rectime;
	}

	public void setRectime(Date rectime) {
		this.rectime = rectime;
	}

	public String getHomephone() {
		return this.homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

}
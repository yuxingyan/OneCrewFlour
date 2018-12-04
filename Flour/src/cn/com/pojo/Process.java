package cn.com.pojo;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * Process entity. @author MyEclipse Persistence Tools
 */
@Component("process")
public class Process implements java.io.Serializable {

	// Fields

	private Integer pid;
	private Integer userid;
	private Float flourweight;
	private Float rate;
	private Float rawweight;
	private Float branweight;
	private String type;
	private Date date;

	// Constructors

	/** default constructor */
	public Process() {
	}

	/** full constructor */
	public Process(Integer userid, Float flourweight, Float rate, Float rawweight, Float branweight, String type,
			Date date) {
		this.userid = userid;
		this.flourweight = flourweight;
		this.rate = rate;
		this.rawweight = rawweight;
		this.branweight = branweight;
		this.type = type;
		this.date = date;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Float getFlourweight() {
		return this.flourweight;
	}

	public void setFlourweight(Float flourweight) {
		this.flourweight = flourweight;
	}

	public Float getRate() {
		return this.rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public Float getRawweight() {
		return this.rawweight;
	}

	public void setRawweight(Float rawweight) {
		this.rawweight = rawweight;
	}

	public Float getBranweight() {
		return this.branweight;
	}

	public void setBranweight(Float branweight) {
		this.branweight = branweight;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
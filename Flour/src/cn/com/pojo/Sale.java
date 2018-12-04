package cn.com.pojo;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * Sale entity. @author MyEclipse Persistence Tools
 */
@Component("sale")
public class Sale implements java.io.Serializable {

	// Fields

	private Integer sid;
	private Integer eid;
	private String type;
	private Float price;
	private Float weight;
	private Float sum;
	private Integer bag;
	private Float bagweight;
	private Integer clientid;
	private Date date;

	// Constructors

	/** default constructor */
	public Sale() {
	}

	/** full constructor */
	public Sale(Integer eid, String type, Float price, Float weight, Float sum, Integer bag, Float bagweight,
			Integer clientid, Date date) {
		this.eid = eid;
		this.type = type;
		this.price = price;
		this.weight = weight;
		this.sum = sum;
		this.bag = bag;
		this.bagweight = bagweight;
		this.clientid = clientid;
		this.date = date;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getWeight() {
		return this.weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Float getSum() {
		return this.sum;
	}

	public void setSum(Float sum) {
		this.sum = sum;
	}

	public Integer getBag() {
		return this.bag;
	}

	public void setBag(Integer bag) {
		this.bag = bag;
	}

	public Float getBagweight() {
		return this.bagweight;
	}

	public void setBagweight(Float bagweight) {
		this.bagweight = bagweight;
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

}
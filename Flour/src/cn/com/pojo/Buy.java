package cn.com.pojo;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * Buy entity. @author MyEclipse Persistence Tools
 */
@Component("buy")
public class Buy implements java.io.Serializable {

	// Fields

	private Integer bid;
	private Integer eid;
	private String type;
	private Float price;
	private Float weight;
	private Float sum;
	private Integer bag;
	private Float bagweight;
	private Date date;

	// Constructors

	/** default constructor */
	public Buy() {
	}

	/** full constructor */
	public Buy(Integer eid, String type, Float price, Float weight, Float sum, Integer bag, Float bagweight,
			Date date) {
		this.eid = eid;
		this.type = type;
		this.price = price;
		this.weight = weight;
		this.sum = sum;
		this.bag = bag;
		this.bagweight = bagweight;
		this.date = date;
	}

	// Property accessors

	public Integer getBid() {
		return this.bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
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

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
package cn.com.pojo;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * Managestore entity. @author MyEclipse Persistence Tools
 */
@Component("managestore")
public class Managestore implements java.io.Serializable {

	// Fields

	private Integer mid;
	private Integer eid;
	private String type;
	private Float weight;
	private String method;
	private Float price;
	private Float sum;
	private Integer clientid;
	private Date date;

	// Constructors

	/** default constructor */
	public Managestore() {
	}

	/** full constructor */
	public Managestore(Integer eid, String type, Float weight, String method, Float price, Float sum, Integer clientid,
			Date date) {
		this.eid = eid;
		this.type = type;
		this.weight = weight;
		this.method = method;
		this.price = price;
		this.sum = sum;
		this.clientid = clientid;
		this.date = date;
	}

	// Property accessors

	public Integer getMid() {
		return this.mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
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

	public Float getWeight() {
		return this.weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getSum() {
		return this.sum;
	}

	public void setSum(Float sum) {
		this.sum = sum;
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
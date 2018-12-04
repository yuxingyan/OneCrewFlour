package cn.com.pojo;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * Useflour entity. @author MyEclipse Persistence Tools
 */
@Component("useflour")
public class Useflour implements java.io.Serializable {

	// Fields

	private Integer uid;
	private Integer eid;
	private Float uweight;
	private Float rate;
	private Float rawweight;
	private Float branweight;
	private String type;
	private Float price;
	private Float sum;
	private Date date;

	// Constructors

	/** default constructor */
	public Useflour() {
	}

	/** full constructor */
	public Useflour(Integer eid, Float uweight, Float rate, Float rawweight, Float branweight, String type, Float price,
			Float sum, Date date) {
		this.eid = eid;
		this.uweight = uweight;
		this.rate = rate;
		this.rawweight = rawweight;
		this.branweight = branweight;
		this.type = type;
		this.price = price;
		this.sum = sum;
		this.date = date;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public Float getUweight() {
		return this.uweight;
	}

	public void setUweight(Float uweight) {
		this.uweight = uweight;
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

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
package cn.com.pojo;

import org.springframework.stereotype.Component;

/**
 * Flourstore entity. @author MyEclipse Persistence Tools
 */
@Component("flourstore")
public class Flourstore implements java.io.Serializable {

	// Fields

	private Integer id;
	private String type;
	private Float millweight;

	// Constructors

	/** default constructor */
	public Flourstore() {
	}

	/** full constructor */
	public Flourstore(String type, Float millweight) {
		this.type = type;
		this.millweight = millweight;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getMillweight() {
		return this.millweight;
	}

	public void setMillweight(Float millweight) {
		this.millweight = millweight;
	}

}
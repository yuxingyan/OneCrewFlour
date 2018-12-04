package cn.com.pojo;

/**
 * Checkstore entity. @author MyEclipse Persistence Tools
 */

public class Checkstore implements java.io.Serializable {

	// Fields

	private Integer id;
	private String type;
	private Float sumstore;
	private Float clientstore;

	// Constructors

	/** default constructor */
	public Checkstore() {
	}

	/** full constructor */
	public Checkstore(String type, Float sumstore, Float clientstore) {
		this.type = type;
		this.sumstore = sumstore;
		this.clientstore = clientstore;
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

	public Float getSumstore() {
		return this.sumstore;
	}

	public void setSumstore(Float sumstore) {
		this.sumstore = sumstore;
	}

	public Float getClientstore() {
		return this.clientstore;
	}

	public void setClientstore(Float clientstore) {
		this.clientstore = clientstore;
	}

}
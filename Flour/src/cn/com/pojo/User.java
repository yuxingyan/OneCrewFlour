package cn.com.pojo;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Component("user")
public class User implements java.io.Serializable {

	// Fields

	private Integer userid;
	private String username;
	private String password;
	private String name;
	private String phone;
	private Timestamp time;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String username, String password, String name, String phone) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}

	/** full constructor */
	public User(String username, String password, String name, String phone, Timestamp time) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.time = time;
	}

	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}
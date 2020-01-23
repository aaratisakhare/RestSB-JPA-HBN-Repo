package com.example.demo.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "UserTable", catalog = "mydb")
public class User {
	private String username;
	@Id
	@Column(name="user_id")
	private String id;
	private String fName;
	@Column(name="user_pwd")
	private String pwd;
	@Column(name="emailid")
	private String email;
	@Column(name="isDeleted")
	private boolean deleted;
	@Column(name="isActive")
	private boolean active;
	@Column(name="createdDate")
	private Date created;
	public User(String username, String id, String fName, String pwd, String email) {
		//super();
		this.username = username;
		this.id = id;
		this.fName = fName;
		this.pwd = pwd;
		this.email = email;
		this.created = new Date();
		this.active = true;
	}
	public User() {
		//super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	} 
}

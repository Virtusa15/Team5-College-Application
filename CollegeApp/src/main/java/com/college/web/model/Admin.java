package com.college.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	private String name;
	@Id
	private String aid;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(String name, String aid, String password) {
		super();
		this.name = name;
		this.aid = aid;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [name=" + name + ", aid=" + aid + ", password=" + password + "]";
	}
	public Admin() {
		super();
	}
	
	
	
	
	

}

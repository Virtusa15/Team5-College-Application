package com.college.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	private String name;
	@Id
	private long aid;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAid() {
		return aid;
	}
	public void setAid(long aid) {
		this.aid = aid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(String name, long aid, String password) {
		super();
		this.name = name;
		this.aid = aid;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [name=" + name + ", aid=" + aid + ", password=" + password + "]";
	}
	
	
	
	

}

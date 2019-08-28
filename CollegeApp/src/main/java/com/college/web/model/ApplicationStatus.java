package com.college.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ApplicationStatus {
	
	
	private String status;
	@Id
	private int aid;
	
	private String name;
	public ApplicationStatus(String status, int aid, String name) {
		super();
		this.status = status;
		this.aid = aid;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public ApplicationStatus() {
		super();
	}
	
	
	
	

}

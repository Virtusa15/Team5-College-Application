package com.college.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
public class PlacementDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sno;
	
	private String Company_name;
	private String CTC;
	private String Company_location;
	private String Role;
	private String Event_time;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getCompany_name() {
		return Company_name;
	}
	public void setCompany_name(String company_name) {
		Company_name = company_name;
	}
	public String getCTC() {
		return CTC;
	}
	public void setCTC(String cTC) {
		CTC = cTC;
	}
	public String getCompany_location() {
		return Company_location;
	}
	public void setCompany_location(String company_location) {
		Company_location = company_location;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getEvent_time() {
		return Event_time;
	}
	public void setEvent_time(String event_time) {
		Event_time = event_time;
	}
	public PlacementDetails( String company_name, String cTC, String company_location, String role,
			String event_time) {
		super();
		
		Company_name = company_name;
		CTC = cTC;
		Company_location = company_location;
		Role = role;
		Event_time = event_time;
	}
	public PlacementDetails() {
		super();
	}
	@Override
	public String toString() {
		return "PlacementDetails [sno=" + sno + ", Company_name=" + Company_name + ", CTC=" + CTC
				+ ", Company_location=" + Company_location + ", Role=" + Role + ", Event_time=" + Event_time + "]";
	}
	
	
	
	
	
}
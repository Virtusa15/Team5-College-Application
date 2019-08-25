package com.college.web.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Applicant {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column( unique = true, nullable = false)
	private int application_id;
	private String First_name;
	private String Last_name;
	private String dob;
	private String Email_id;
	private long Mobile_no;
	private String Gender;
	private String  Address;
	private String city;
	private long Pin_code;
	private String State;
	private String Country;
	private String percentage;
	private String Course;
	private String Stream;
	public int getApplication_id() {
		return application_id;
	}
	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail_id() {
		return Email_id;
	}
	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}
	public long getMobile_no() {
		return Mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		Mobile_no = mobile_no;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPin_code() {
		return Pin_code;
	}
	public void setPin_code(long pin_code) {
		Pin_code = pin_code;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getStream() {
		return Stream;
	}
	public void setStream(String stream) {
		Stream = stream;
	}
	public Applicant(String first_name, String last_name, String dob, String email_id, long mobile_no,
			String gender, String address, String city, long pin_code, String state, String country, String percentage,
			String course, String stream) {
		super();
		this.application_id = application_id;
		First_name = first_name;
		Last_name = last_name;
		this.dob = dob;
		Email_id = email_id;
		Mobile_no = mobile_no;
		Gender = gender;
		Address = address;
		this.city = city;
		Pin_code = pin_code;
		State = state;
		Country = country;
		this.percentage = percentage;
		Course = course;
		Stream = stream;
	}
	@Override
	public String toString() {
		return "Applicant [application_id=" + application_id + ", First_name=" + First_name + ", Last_name=" + Last_name
				+ ", dob=" + dob + ", Email_id=" + Email_id + ", Mobile_no=" + Mobile_no + ", Gender=" + Gender
				+ ", Address=" + Address + ", city=" + city + ", Pin_code=" + Pin_code + ", State=" + State
				+ ", Country=" + Country + ", percentage=" + percentage + ", Course=" + Course + ", Stream=" + Stream
				+ "]";
	}
	
	
	
	
	
	
	
	

}

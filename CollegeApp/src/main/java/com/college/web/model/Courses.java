package com.college.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {
@Id
private	long   courseid;

private String Course_Name;
private String Faculty_Name;
private String Time;
public long getCourseid() {
	return courseid;
}
public void setCourseid(long courseid) {
	this.courseid = courseid;
}
public String getCourse_Name() {
	return Course_Name;
}
public void setCourse_Name(String course_Name) {
	Course_Name = course_Name;
}
public String getFaculty_Name() {
	return Faculty_Name;
}
public void setFaculty_Name(String faculty_Name) {
	Faculty_Name = faculty_Name;
}
public String getTime() {
	return Time;
}
public void setTime(String time) {
	Time = time;
}
public Courses(long courseid, String course_Name, String faculty_Name, String time) {
	super();
	this.courseid = courseid;
	Course_Name = course_Name;
	Faculty_Name = faculty_Name;
	Time = time;
}
public Courses() {
	super();
}
@Override
public String toString() {
	return "Courses [courseid=" + courseid + ", Course_Name=" + Course_Name + ", Faculty_Name=" + Faculty_Name
			+ ", Time=" + Time + "]";
}
	
	

}

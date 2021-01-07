package com.example.demo.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student_table")
public class Student {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int sid;
 private String sname;
 private int srank;
 @ManyToMany(mappedBy="students",cascade=CascadeType.ALL)
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getSrank() {
	return srank;
}
public void setSrank(int srank) {
	this.srank = srank;
}
private List<Course>courses=new ArrayList<>();

public List<Course> getCourses() {
	return courses;
}
public void setCourses(List<Course> courses) {
	this.courses = courses;
}
public Student() {}
public Student(String sname, int srank) {
	super();
	this.sname = sname;
	this.srank = srank;
}

	
}
 
 

package com.example.demo.entities;
import java.util.*;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course_table")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String cname;

	@JoinTable(name="std_course_join",joinColumns=@JoinColumn(name="cid_fk"),inverseJoinColumns=@JoinColumn(name="sid_fk"))
	@ManyToMany(cascade=CascadeType.ALL)
	
	
	private List<Student>students=new ArrayList<>();
	
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Course() {}
	public Course(String cname) {
		super();
		this.cname = cname;
	}
	

	
	
}

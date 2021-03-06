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
@Table(name="emp_proj_table")
public class Employee {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int eid;
 private String name;
 private double salary;
 @ManyToMany(mappedBy="employees",cascade=CascadeType.ALL)
 private List<Project>projects=new ArrayList<>();
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public List<Project> getProjects() {
	return projects;
}
public void setProjects(List<Project> projects) {
	this.projects = projects;
}
public Employee() {}
public Employee(String name, double salary) {
	this.name = name;
	this.salary = salary;
	
}
 
 
}
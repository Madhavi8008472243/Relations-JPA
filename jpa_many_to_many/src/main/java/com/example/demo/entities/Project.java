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
@Table(name="project_table")
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private String manager;
	private LocalDate startDate;
	@JoinTable(name="emp_project_join",joinColumns=@JoinColumn(name="pid_fk"),inverseJoinColumns=@JoinColumn(name="eid_fk"))
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Employee>employees=new ArrayList<>();
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Project() {}
	public Project(String pname, String manager, LocalDate startDate) {
		super();
		this.pname = pname;
		this.manager = manager;
		this.startDate = startDate;
	}

	
	
}

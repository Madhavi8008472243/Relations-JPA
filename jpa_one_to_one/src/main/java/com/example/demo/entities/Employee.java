package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_table")
public class Employee {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int eid;
 private String name;
 private double salary;
 @JoinColumn(name="eid_fk")
 //@OneToOne(cascade=CascadeType.ALL)
 @OneToOne(mappedBy="employee", cascade=CascadeType.ALL,fetch=FetchType.LAZY)//EAGER
 private Parking parking;

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
public Parking getParking() {
	return parking;
}
public void setParking(Parking parking) {
	this.parking = parking;
}
public Employee(String name, double salary,Parking parking) {
	
	this.name = name;
	this.salary = salary;
	this.parking=parking;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", parking=" + parking + "]";
}

public Employee() {

}



 
 
}

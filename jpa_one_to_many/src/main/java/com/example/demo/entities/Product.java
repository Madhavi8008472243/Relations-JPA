package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product_table")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int pid;
    private String pname;
    private double cost;
    @JoinColumn(name="cid_fk")
    @ManyToOne
    private Customer customer;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product(String pname, double cost, Customer customer) {
		super();
		this.pname = pname;
		this.cost = cost;
		this.customer = customer;
	}
	public Product() {
		
	}
    
    
}

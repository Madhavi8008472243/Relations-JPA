package com.example.demo.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Product1_table")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int pid;
    private String pname;
    private double cost;
    @OneToMany(mappedBy="Product",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<Review>reviews=new ArrayList<>();
    public int getpid() {
		return pid;
	}

	public void setpid(int pid) {
		this.pid = pid;
	}

	public String getpname() {
		return pname;
	}

	public void setpname(String pname) {
		this.pname = pname;
	}
	

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> Reviews) {
		this.reviews = reviews;
	}

	
	

	public Product() {
	}
	
	public Product(String pname, List<Review> reviews) {
		
		this.pname = pname;
		this.reviews = reviews;
	}

	public Product(String pname,double cost) {
		super();
		this.pname = pname;
		this.cost=cost;
		
	}



	

}

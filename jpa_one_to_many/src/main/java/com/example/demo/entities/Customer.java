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
@Table(name="customer_table")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int cid;
    private String cname;
    
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

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	

	public Customer() {
	}
	


	public Customer(String cname) {
		super();
		this.cname = cname;
	}



	@OneToMany(mappedBy="Customer",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<Product>products=new ArrayList<>();

}

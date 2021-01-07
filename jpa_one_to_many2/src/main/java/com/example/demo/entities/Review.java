package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="review_table")
public class Review {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int rid;
    private String type;
    private Integer rating;
    @JoinColumn(name="pid_fk")
    @ManyToOne
    private Product product;
	
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	public Review(String type, Integer rating, Product product) {
		this.type = type;
		this.rating = rating;
		this.product = product;
	}
	public Review() {
		
	}
    
    
}

package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="post_table")
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String pname;
    private String postdate;
    private String details;
    @JoinColumn(name="uid_fk")
    @ManyToOne
    private User user;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPostdate() {
		return postdate;
	}
	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Post(String pname, String postdate, String details, User user) {
		super();
		this.pname = pname;
		this.postdate = postdate;
		this.details = details;
		this.user = user;
	}
	public Post() {
		
	}
    
    
}

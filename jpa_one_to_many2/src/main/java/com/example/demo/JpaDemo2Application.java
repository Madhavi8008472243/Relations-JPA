package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Product;
import com.example.demo.entities.Review;
import com.example.demo.repo.ProductRepo;
import com.example.demo.repo.ReviewRepo;



@SpringBootApplication
public class JpaDemo2Application implements CommandLineRunner {
	@Autowired
private ReviewRepo reviewRepo;
	@Autowired
private ProductRepo productRepo;
	public static void main(String[] args) {
		SpringApplication.run(JpaDemo2Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Product p1=new Product("Laptap",40000);
		Product p2=new Product("Mobile",17000);
		Product p3=new Product("TV", 50000);
		
		
		Review r1=new Review("Easy To Operate",9,p1);
		Review r2=new Review("Memory Space More",10,p1);
		
		Review r3=new Review("Good audio Quality",8,p2);
		Review r4=new Review("Good video Quality",5,p2);
		
		Review r5=new Review("Good Display",5,p3);
		Review r6=new Review("Picture Quality is good",8,p3);
		
		p1.getReviews().add(r1);
		p1.getReviews().add(r2);
		
		p2.getReviews().add(r3);
		p2.getReviews().add(r4);
		
		p3.getReviews().add(r5);
		p3.getReviews().add(r6);
		
		productRepo.save(p1);
		productRepo.save(p1);
		productRepo.save(p1);
	
		reviewRepo.save(r1);
		reviewRepo.save(r2);
		reviewRepo.save(r3);
		reviewRepo.save(r4);
		reviewRepo.save(r5);
		reviewRepo.save(r6);
		
		
	}
}

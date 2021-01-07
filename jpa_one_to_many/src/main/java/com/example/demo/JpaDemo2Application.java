package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Product;
import com.example.demo.repo.CustomerRepo;
import com.example.demo.repo.ProductRepo;



@SpringBootApplication
public class JpaDemo2Application implements CommandLineRunner {
	@Autowired
private CustomerRepo customerRepo;
	@Autowired
private ProductRepo productRepo;
	public static void main(String[] args) {
		SpringApplication.run(JpaDemo2Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Customer c1=new Customer("Madhavi");
		Customer c2=new Customer("Bharath");
		Customer c3=new Customer("Madhu");
		
		
		Product p1=new Product("book",15,c1);
		Product p2=new Product("pen",10,c1);
		Product p3=new Product("pencil",05,c2);
		Product p4=new Product("box",50,c2);
		Product p5=new Product("bucket",250,c3);
		Product p6=new Product("book",15,c3);
		
		c1.getProducts().add(p1);
		c1.getProducts().add(p2);
		
		c2.getProducts().add(p3);
		c2.getProducts().add(p4);
		
		c3.getProducts().add(p5);
		c3.getProducts().add(p6);
		
		customerRepo.save(c1);
		customerRepo.save(c2);
		customerRepo.save(c3);
	
		productRepo.save(p1);
		productRepo.save(p2);
		productRepo.save(p3);
		productRepo.save(p4);
		productRepo.save(p5);
		productRepo.save(p6);
		
		
		
	}
}

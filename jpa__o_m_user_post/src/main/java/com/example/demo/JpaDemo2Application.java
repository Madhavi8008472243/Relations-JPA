package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.User;
import com.example.demo.entities.Post;
import com.example.demo.repo.UserRepo;
import com.example.demo.repo.PostRepo;



@SpringBootApplication
public class JpaDemo2Application implements CommandLineRunner {
	@Autowired
private UserRepo userRepo;
	@Autowired
private PostRepo postRepo;
	public static void main(String[] args) {
		SpringApplication.run(JpaDemo2Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		User u1=new User("Madhavi","yaramaddu","Andhra","madhavi@gmail.com");
		User u2=new User("Bharath","yammula","Ooty","bharatrh@gmail.com");
		User u3=new User("Madhu","chinthala","Goa","madhu@gmail.com");
		
		
		Post p1=new Post("Video","15-November-2020","marriage", u1);
		Post p2=new Post("audio","15-December-2020","Event1",u1);
		Post p3=new Post("pics","25-December-2020","Event2",u2);
		Post p4=new Post("Dance Video","05-December-2020","Event3",u2);
		Post p5=new Post("recording audio","17-December-2029","Event4",u3);
		Post p6=new Post("Study Materials","15-Novemeber-2019","Event5",u3);
		
		u1.getPosts().add(p1);
		u1.getPosts().add(p2);
		
		u2.getPosts().add(p3);
		u2.getPosts().add(p4);
		
		u3.getPosts().add(p5);
		u3.getPosts().add(p6);
		
		userRepo.save(u1);
		userRepo.save(u2);
		userRepo.save(u3);
	
		postRepo.save(p1);
		postRepo.save(p2);
		postRepo.save(p3);
		postRepo.save(p4);
		postRepo.save(p5);
		postRepo.save(p6);
		
		
		
	}
}

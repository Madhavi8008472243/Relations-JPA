package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Student;
import com.example.demo.entities.Course;
import com.example.demo.repo.StudentRepo;
import com.example.demo.repo.CourseRepo;



@SpringBootApplication
public class JpaDemo2Application implements CommandLineRunner {
	@Autowired
private StudentRepo studentRepo;
	@Autowired
private CourseRepo courseRepo;
	public static void main(String[] args) {
		SpringApplication.run(JpaDemo2Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		
		
		
		
		Student s1=new Student("ekta",5);
	    Student s2=new Student("keshav",1);
		Student s3=new Student("gunika",4);
		
		Student s4=new Student("madhavi",2);
	    Student s5=new Student("kousal",7);
		Student s6=new Student("guna",3);
		
		Student s7=new Student("madhu",6);
	    Student s8=new Student("mounish",8);
		Student s9=new Student("Bharath",9);
				
		
		Course course1=new Course("Python");
		Course course2=new Course("Java");
		Course course3=new Course("MySQL");
		
		course1.getStudents().add(s1);
		course1.getStudents().add(s2);
		course1.getStudents().add(s3);
		
		course2.getStudents().add(s4);
		course2.getStudents().add(s5);
		course2.getStudents().add(s6);
		
		course3.getStudents().add(s7);
		course3.getStudents().add(s8);
		course3.getStudents().add(s9);
		
		
		s1.getCourses().add(course1);
		s2.getCourses().add(course1);
	    s3.getCourses().add(course1);
		
	    s4.getCourses().add(course2);
		s5.getCourses().add(course2);
		s6.getCourses().add(course2);
		
		s7.getCourses().add(course3);
		s8.getCourses().add(course3);
		s9.getCourses().add(course3);
		
		
		courseRepo.save(course1);
		courseRepo.save(course2);
		courseRepo.save(course3);
		
				
		studentRepo.save(s1);
		studentRepo.save(s2);
		studentRepo.save(s3);
				
		studentRepo.save(s4);
		studentRepo.save(s5);
		studentRepo.save(s6);
		
		studentRepo.save(s7);
		studentRepo.save(s8);
		studentRepo.save(s9);
				
	
	}
}

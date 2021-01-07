package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Project;
import com.example.demo.repo.EmployeeRepo;
import com.example.demo.repo.ProjectRepo;



@SpringBootApplication
public class JpaDemo2Application implements CommandLineRunner {
	@Autowired
private EmployeeRepo empRepo;
	@Autowired
private ProjectRepo projectRepo;
	public static void main(String[] args) {
		SpringApplication.run(JpaDemo2Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		
		
		
		
		Employee emp1=new Employee("ekta",4000.00);
	    Employee emp2=new Employee("keshav",5000.00);
		Employee emp3=new Employee("gunika",7000.00);
		
		Employee emp4=new Employee("madhavi",4300.00);
	    Employee emp5=new Employee("kousal",5590.00);
		Employee emp6=new Employee("guna",7300.00);
		
		Employee emp7=new Employee("madhu",4300.00);
	    Employee emp8=new Employee("mounish",5300.00);
		Employee emp9=new Employee("Bharath",7100.00);
				
		
		Project project1=new Project("shopping Cart","raj",LocalDate.of(2021, Month.JANUARY, 2));
		Project project2=new Project("bank app","rahul",LocalDate.of(2020, Month.APRIL, 12));
		Project project3=new Project("BookStore","rajeev",LocalDate.of(2020, Month.DECEMBER, 22));
		
		project1.getEmployees().add(emp1);
		project1.getEmployees().add(emp2);
		project1.getEmployees().add(emp3);
		
		project2.getEmployees().add(emp4);
		project2.getEmployees().add(emp5);
		project2.getEmployees().add(emp6);
		
		project3.getEmployees().add(emp7);
		project3.getEmployees().add(emp8);
		project3.getEmployees().add(emp9);
		
		
		emp1.getProjects().add(project1);
		emp2.getProjects().add(project1);
		emp3.getProjects().add(project1);
		
		emp4.getProjects().add(project2);
		emp5.getProjects().add(project2);
		emp6.getProjects().add(project2);
		
		emp7.getProjects().add(project3);
		emp8.getProjects().add(project3);
		emp9.getProjects().add(project3);
		
		
		projectRepo.save(project1);
		projectRepo.save(project2);
		projectRepo.save(project3);
		
				
				empRepo.save(emp1);
				empRepo.save(emp2);
				empRepo.save(emp3);
				
				empRepo.save(emp4);
				empRepo.save(emp5);
				empRepo.save(emp6);
				
				empRepo.save(emp7);
				empRepo.save(emp8);
				empRepo.save(emp9);
				
				
				
	
	}
}

package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Parking;
import com.example.demo.repo.EmployeeRepo;



@SpringBootApplication
public class JpaDemo2Application implements CommandLineRunner {
	@Autowired
private EmployeeRepo empRepo;
	@Autowired
private Parking parkingRepo;
	public static void main(String[] args) {
		SpringApplication.run(JpaDemo2Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Employee employee=empRepo.findById(2).orElseThrow(RuntimeException::new);
		empRepo.delete(employee);
		
		/*
		 * List<Employee>employees=empRepo.findAll();
		 * employees.forEach(e->System.out.println(e));
		 */
		
		
		/*Parking parking1=new Parking("A34");
		Parking parking2=new Parking("M34");
		Parking parking3=new Parking("F34");
		
		Employee emp1=new Employee("ekta",4000.00,parking1);
				Employee emp2=new Employee("keshav",5000.00,parking2);
				Employee emp3=new Employee("gunika",7000.00,parking3);
				
				parking1.setEmployee(emp1);
				parking2.setEmployee(emp2);
				parking3.setEmployee(emp3);
				
				empRepo.save(emp1);
				empRepo.save(emp2);
				empRepo.save(emp3);
				
				parkingRepo.save(parking1);
				parkingRepo.save(parking2);
				parkingRepo.save(parking3);
				
	*/
	}
}

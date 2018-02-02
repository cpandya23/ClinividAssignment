package com.Chintan.SpringBoot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
public class EmployeeApplication {

	public static List<Employee> employeeList=new ArrayList<>(); 
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(EmployeeRepository repository) {
		return (args) -> {
		
			for (Employee employee : repository.findAll()) {
				employeeList.add(employee);
			}
		
		};
	}
}

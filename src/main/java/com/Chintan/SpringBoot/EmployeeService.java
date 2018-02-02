package com.Chintan.SpringBoot;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/employee")
public class EmployeeService {
	
	@RequestMapping(value="/getEmployees",method=RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		return EmployeeApplication.employeeList;
	}
	
	
}


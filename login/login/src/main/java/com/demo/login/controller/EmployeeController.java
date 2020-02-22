package com.demo.login.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.login.model.EmployeePojo;


@RestController

public class EmployeeController {
	@GetMapping("/employee/{empId}")
EmployeePojo getEmployee(@PathVariable("empId") int eId)
{
		
		EmployeePojo empPojo=new EmployeePojo();
		empPojo.setEmpNo(eId);
		empPojo.setEmpName("ash");
		empPojo.setEmpSalary(10000);
		return empPojo;
	
}
	
	@GetMapping("/employees")
	ArrayList<EmployeePojo> getEmployees()
	{
			
			//EmployeePojo empPojo=new EmployeePojo();
			
			ArrayList<EmployeePojo> arraylist = new ArrayList<EmployeePojo>();
			   arraylist.add(new EmployeePojo(223, "Chaitanya", 26000));
			   
			   arraylist.add(new EmployeePojo(245, "Rahul", 24));
			   arraylist.add(new EmployeePojo(209, "Ajeet", 32));
			return (arraylist);  
	}
}

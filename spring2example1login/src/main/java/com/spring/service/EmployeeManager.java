package com.spring.service;

import java.util.*;

import com.spring.model.Employee;

public class EmployeeManager {
private static List<Employee> employeeList;
public EmployeeManager()
{
	employeeList=new ArrayList<Employee>();
	employeeList.add(new Employee("1","Mike","Smith"));
	employeeList.add(new Employee("2","John","Taylor"));
	employeeList.add(new Employee("3","Dave","Wilson"));
	//employeeList.add(new Employee("1","Mike","Smith"));
}
	public List<Employee>getEmployeeList()
	{
		return employeeList;
	}
}
package com.demo.login.model;

public class EmployeePojo {
private int empNo;
private String empName;
private int empSalary;

public int getEmpNo() {
	return empNo;
}

public void setEmpNo(int empNo) {
	this.empNo = empNo;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public int getEmpSalary() {
	return empSalary;
}

public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}


public EmployeePojo(int empNo, String empName, int empSalary) {
	super();
	this.empNo = empNo;
	this.empName = empName;
	this.empSalary = empSalary;
}


public EmployeePojo() {
	super();
}

@Override
public String toString() {
	return "EmployeePojo [empNo=" + empNo + ", empName=" + empName + ", empSalary=" + empSalary + "]";
}

}

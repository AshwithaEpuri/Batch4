package com.demo.login.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.login.model.EmployeePojo;
import com.demo.login.model.LoginPojo;

@RestController
@RequestMapping(value="/login")
public class LoginController {

	@GetMapping("/validate/{username}/{password}")
LoginPojo getLoginDetails(@PathVariable  ("username") String userName, @PathVariable  ("password") String passWord)
{
		
		LoginPojo loginPojo=new LoginPojo();
		String username=userName;
		String password=passWord;
	//	String role=userName;
		loginPojo.setUserName(userName);
		loginPojo.setPassword(password);
		//empPojo.setRole(username);
		if(loginPojo.getUserName().equals("admin") && loginPojo.getPassword().equals("admin"))
		{
			loginPojo.setRole(username);
		}  
		return loginPojo;  
}
@GetMapping("/validate1")
LoginPojo validateLogin(@RequestBody LoginPojo loginPojo)
{
	if(loginPojo.getUserName().equals("admin") && loginPojo.getPassword().equals("admin"))
	{
		loginPojo.setRole("admin");
	}  
	return loginPojo;
}
}

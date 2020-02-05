package com.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.demo.model.Registerpojo;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String un = request.getParameter("un");

		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String date = request.getParameter("date");
		String gen = request.getParameter("gender");
		String hob[] = request.getParameterValues("hobbies");
		String add = request.getParameter("address");
		String con = request.getParameter("select");
System.out.println(un);
		String hobbies="";
		for(int i=0;i<hob.length;i++)
		{
			hobbies+=hob[i]+",";
		}
		System.out.println(hobbies);
		Registerpojo registerPojo = new Registerpojo();
		registerPojo.setUserName(un);
		registerPojo.setPassword(pwd);
		registerPojo.setName(name);
		registerPojo.setDob(date);
		registerPojo.setGender(gen);
		registerPojo.setHobbies(hobbies);
		registerPojo.setAddress(add);
		registerPojo.setCountry(con);
		RegisterService registerService = new RegisterService();
		Registerpojo	l = registerService.validateLogin(registerPojo);
	
	if (l == null) {

		// request.setAttribute("error", "Invalid username/password");
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("register.jsp");
		request.setAttribute("error", "please fill the details");
		requestDispatcher.forward(request, response);
	}
	
	else
	{
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Result.jsp");
		
		request.setAttribute("loginDetails", registerPojo);
		requestDispatcher.forward(request, response);
	}
	}
}

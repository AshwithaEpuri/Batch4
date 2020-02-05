package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.LoginPojo;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// PrintWriter out = response.getWriter();
		String n1 = request.getParameter("un");

		String n2 = request.getParameter("pwd");
		
		// RequestDispatcher requestDispatcher=null;
		// requestDispatcher = request.getRequestDispatcher("Result1.jsp");
		LoginPojo loginpojo = new LoginPojo();
		loginpojo.setUsername(n1);
		loginpojo.setPassword(n2);
		LoginService loginService = new LoginService();
	LoginPojo	l = loginService.validateLogin(loginpojo);
System.out.println(l);
		// request.setAttribute("result", result);
		if (loginpojo.getRole() == null) {

			// request.setAttribute("error", "Invalid username/password");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("login1.jsp");
			request.setAttribute("error", "Invalid username/password");
			requestDispatcher.forward(request, response);
		}

		/*
		 * if (n1.equals("ashwitha") && n2.equals("123")) {
		 * //requestDispatcher=request.getRequestDispatcher("success.html");
		 * request.setAttribute("result","success"); }
		 */
		else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Result1.jsp");
			
			request.setAttribute("loginDetails", loginpojo);
			requestDispatcher.forward(request, response);
		}

	}

}
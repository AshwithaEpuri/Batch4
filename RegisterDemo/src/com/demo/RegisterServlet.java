package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	//	PrintWriter out = response.getWriter();
		String n1 = request.getParameter("un");

		String n2 = request.getParameter("pwd");
		RequestDispatcher requestDispatcher=null;
		requestDispatcher = request.getRequestDispatcher("Result1.jsp");
		RegisterService registerService = new RegisterService();
		String result=registerService.validateLogin(n1, n2);
		request.setAttribute("result", result);
		
		/*if (n1.equals("ashwitha") && n2.equals("123")) {
			//requestDispatcher=request.getRequestDispatcher("success.html");
		request.setAttribute("result","success"); 
		}
		else
		{
			//requestDispatcher=request.getRequestDispatcher("failure.html");
			request.setAttribute("result","failure");
		}*/
			requestDispatcher.forward(request, response);
		}


}
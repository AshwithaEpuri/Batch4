

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
	String user,pass;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		user=request.getParameter("user");
		pass=request.getParameter("pass");
		request.setAttribute("User",user);
		if(user.equals("Ashwitha")&& pass.equals("ashwith"))
		{
		//response.sendRedirect("Servlet2?User="+user);
			HttpSession session=request.getSession();
			session.setAttribute("User",user);
			out.println(user+"Welcome");
		}
		else
		
		{
		
			out.println("Sorry,Invalid Username and password");
			request.getRequestDispatcher("Login1.html").include(request, response);
		}
			
			System.out.println("inside service method");
	}

}



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class RegisterServlet extends HttpServlet {
	String name,password,email,country;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		name=request.getParameter("name");
		password=request.getParameter("pwd");
		email=request.getParameter("email");
		country=request.getParameter("country");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashwitha_db","root","");
		    Statement st=c.createStatement();
		   int count=st.executeUpdate("insert into ashwitha_db.Register values('"+name+"','"+password+"','"+email+"','"+country+"')");
		  out.println(count+"rows updated");
		}
		catch(Exception e)
		{
			
		}
	}

}

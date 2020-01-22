

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	request.getRequestDispatcher("Link.html").include(request, response);
	HttpSession session=request.getSession();
	session.invalidate();
	out.println("Successfully logout from the site ");
	}
}

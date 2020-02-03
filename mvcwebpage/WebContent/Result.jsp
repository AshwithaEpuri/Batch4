<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   String resultData=(String)request.getAttribute("result");
   if(resultData.equals("success"))
	   out.println("<h2>Login success</h2>");
   else
	   out.println(" <h2><font color='red'>Invalid Login </font></h2> ");
 %>
</body>
</html>
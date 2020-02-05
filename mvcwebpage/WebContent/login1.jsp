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
String message = (String)request.getAttribute("error");
if(message !=null)
{
out.println(message);
}
%>
<form action="LoginServlet" method="POST">
<table border="">
<tr>
<td>username<input type="text" name="un"></td>
</tr>
<tr>
<td>
password:<input type="password" name="pwd">
</td>
</tr>
<tr><td><input type="submit" value="submit">
<input type="reset" value="clear">
</td>
</tr>
</table>

</form>
</body>
</body>
</html>
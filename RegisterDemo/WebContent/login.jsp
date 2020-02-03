<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="RegisterServlet" method="POST">
<table border="">
<tr>
<th><b>username</b></th> <td> <input type="text" name="un"></td>
</tr>
<tr>
<th>
<b>password: </b>  </th><td>  <input type="password" name="pwd">
</td>
</tr>
<tr><th><b>Name</b> </th><td> <input type="text" name="name"></td>
</tr>
<tr><th><b>DOB</b> </th><td>  <input type="date" name="date"></td>
</tr>
<tr><th><b>Gender</b></th><td> <input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female</td>
</tr>

<tr><th><b>Hobbies</b></th><td> <input type="checkbox" name="hobbies" value="batminton">batminton
<input type="checkbox" name="hobbies" value="cricket">cricket
<input type="checkbox" name="hobbies" value="cooking">cooking</td>

<tr><th><b>Address</b></th><td> <textarea rows="4" cols="18" name="address"></textarea>
<tr><td><b>Country</b>
<td>
<select>
<option name="select">select</option>
<option name="Ind">India</option>
<option name="Eng">England</option>
<option name="Singapore">Singapore</option>
<option name="Lon">London</option>

</select>
</td>
</tr>

<tr><td><input type="submit" value="submit">
<input type="reset" value="clear">
</td>
</tr>
</table>

</form>
</body>
</html>
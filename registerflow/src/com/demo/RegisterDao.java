package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.demo.model.Registerpojo;



public class RegisterDao {
	public Registerpojo validateLogin(Registerpojo registerPojo)
	  {
		
	try
	{
	//Scanner s=new Scanner(System.in);
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
	PreparedStatement ps=c.prepareStatement("insert into student.registertb values(?,?,?,?,?,?,?,?)");
	//ps.setString(1,user);
	//ps.setString(2,pass);
	int i=ps.executeUpdate();
	/*while(rs.next())  
	{
		//System.out.println(rs.getString(1)+"  "+rs.getString(2)); 
		if( registerpojo.getUsername().equals(rs.getString(1)) &&  loginpojo.getPassword().equals(rs.getString(2)))
		{
			loginpojo.setRole(rs.getString(3));
			break;
		}
	}*/
	if(i!=0)
	{
		registerPojo.getUserName();
	}
		c.close(); 
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	return registerPojo;
}
}

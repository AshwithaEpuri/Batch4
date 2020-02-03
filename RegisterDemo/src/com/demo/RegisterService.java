package com.demo;

public class RegisterService {
  public String validateLogin(String userName,String password)
  {
	  
	  RegisterDao registerdao = new RegisterDao();
		String result=registerdao.validateLogin(userName,password);
	 /* String result=null;
	  if(userName.equals("admin") && password.equals("admin"))
	  {
		  result= "success";
		  
	  }
	  else
	  {
	  result = "failure";
	  }*/
	  return result;
	  
	  
  }
 
}

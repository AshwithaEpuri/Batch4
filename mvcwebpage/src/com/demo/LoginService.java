package com.demo;

public class LoginService {
  public String validateLogin(String userName,String password)
  {
	  
	  LoginDao logindao = new LoginDao();
		String result=logindao.validateLogin(userName,password);
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

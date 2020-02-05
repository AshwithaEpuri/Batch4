package com.demo;

import com.demo.model.LoginPojo;

public class LoginService {
  public LoginPojo validateLogin(LoginPojo loginpojo)
  {
	  
	  LoginDao logindao = new LoginDao();
	 // LoginPojo loginpojo =logindao.validateLogin(loginpojo);
	  loginpojo=logindao.validateLogin(loginpojo);
		System.out.println(loginpojo);
	 /* String result=null;
	  if(userName.equals("admin") && password.equals("admin"))
	  {
		  result= "success";
		  
	  }
	  else
	  {
	  result = "failure";
	  }*/
	  return loginpojo;
	  
	  
  }
 
}

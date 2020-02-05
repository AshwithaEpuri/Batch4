package com.demo;

import com.demo.model.Registerpojo;

public class RegisterService {

	public Registerpojo validateLogin(Registerpojo registerpojo) {
		
		RegisterDao logindao = new RegisterDao();
		 return registerpojo=logindao.validateLogin(registerpojo);
	}

	


}

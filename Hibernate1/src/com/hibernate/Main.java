package com.hibernate;

//import javax.transaction.Transaction;

//import javax.security.auth.login.Configuration;
//import javax.transaction.Transaction;
import org.hibernate.*;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Student s=new Student();
		s.setSid(67);
		s.setSname("hello");
		int count=(int)session.save(s);
		t.commit();
	System.out.println(count+"rows updated");
	}

}

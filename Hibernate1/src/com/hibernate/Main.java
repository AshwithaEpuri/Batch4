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
		String sql="DELETE FROM Student WHERE sid=103";
	   Query query=session.createQuery(sql);
	   int row=query.executeUpdate();
	    if(row==0)
	    System.out.println("does not deleted any row");
	    else
	    	System.out.println("Deleted row:"+row);
	}

}

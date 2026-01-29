package com.Maven.Hibernate_Practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		System.out.println("Program Started....");
		// Step 1: Load configuration
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		 // Step 2: Build SessionFactory
		SessionFactory sf=cfg.buildSessionFactory();
		
		// Step 3: Open session
		Session session=sf.openSession();
		session.beginTransaction();
		
		//Step 4: save object
		Question q=new Question(101,"What is Java");
		session.save(q);
		
		//step 5:commit
		session.getTransaction().commit();
		session.close();
		sf.close();
		System.out.println("Record inserted sussessfully...");

	}
}

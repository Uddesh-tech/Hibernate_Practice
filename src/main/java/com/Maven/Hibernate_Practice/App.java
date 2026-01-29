package com.Maven.Hibernate_Practice;

import javax.transaction.Transaction;

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
		SessionFactory sf = cfg.buildSessionFactory();

		// Step 3 : creating question
		Question q1 = new Question();
		q1.setQ_id(101);
		q1.setQ_name("What is Java");

		// creating answer
		Answer ans = new Answer();
		ans.setAns_id(111);
		ans.setAnswer("Java is Programming lang");

		Session s = sf.openSession();
		org.hibernate.Transaction tx=(org.hibernate.Transaction) s.beginTransaction();
		
		q1.setAnswer(ans);
		
		s.save(q1);
		s.save(ans);

		tx.commit();

		s.close();

		System.out.println("Record inserted sussessfully...");

	}
}

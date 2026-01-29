package com.Maven.Hibernate_Practice;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App_1 {
	public static void main(String[] args) {
		System.out.println("Program Started....");
		// Step 1: Load configuration
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		// Step 2: Build SessionFactory
		SessionFactory sf = cfg.buildSessionFactory();

		/* One to One Mapping */

		// Step 3 : creating question
		Question_new q1 = new Question_new();
		q1.setQ_id(101);
		q1.setQ_name("What is Java");

		// creating answer
		Answer_new answer = new Answer_new();
		answer.setAns_id(11);
		answer.setAnswer("Java is Programming lang");
		answer.setAns_id(null);

		Answer_new answer1 = new Answer_new();
		answer1.setAns_id(12);
		answer1.setAnswer("Java is OOP lang.");

		Answer_new answer2 = new Answer_new();
		answer2.setAns_id(13);
		answer2.setAnswer("Java is Pure OOP lang.");

		List<Answer_new> list = new ArrayList<Answer_new>();
		list.add(answer);
		list.add(answer1);
		list.add(answer2);

		q1.setAnswer_new(list);

		Session s = sf.openSession();
		org.hibernate.Transaction tx = (org.hibernate.Transaction) s.beginTransaction();

		s.save(q1);
		s.save(answer);
		s.save(answer1);
		s.save(answer2);

		tx.commit();

		s.close();

		System.out.println("Record inserted sussessfully...");

	}
}

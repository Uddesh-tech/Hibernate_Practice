package com.Maven.Hibernate_Practice;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQL_Query_Demo {
	public static void main(String[] args) {
		System.out.println("Program Started....");
		// Step 1: Load configuration
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		// Step 2: Build SessionFactory
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();

		String query = "from Employee";
		Query q = s.createQuery(query);

		List<Employee> lst=q.list();
		for (Employee employee : lst) {
			System.out.println(employee.getEmp_name());
		}
		
		
		s.close();
		sf.close();
	}
}

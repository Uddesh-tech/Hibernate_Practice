package com.Maven.Hibernate_Practice;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {
		System.out.println("Program Started....");
		// Step 1: Load configuration
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		// Step 2: Build SessionFactory
		SessionFactory sf = cfg.buildSessionFactory();

		//Many to Many Mapping
		// creating employee
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.setEmp_id(123);
		emp1.setEmp_name("Uddesh");

		emp2.setEmp_id(122);
		emp2.setEmp_name("Rahul");

		Project proj1 = new Project();
		Project proj2 = new Project();

		proj1.setP_id(01);
		proj1.setProj_name("Construction ERP");

		proj2.setP_id(02);
		proj2.setProj_name("Payroll");

		List<Employee> lst1 = new ArrayList<Employee>();
		List<Project> lst2 = new ArrayList<Project>();

		lst1.add(emp1);
		lst1.add(emp2);

		lst2.add(proj1);
		lst2.add(proj2);

		emp1.setProjects(lst2);
		proj2.setEmployees(lst1);

		Session s = sf.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		s.save(emp1);
		s.save(emp2);
		s.save(proj1);
		s.save(proj2);

		tx.commit();
		sf.close();
	}
}

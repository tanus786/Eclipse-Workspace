package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//get and load 
		System.out.println("Project Start");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		//get from id
		Student student = (Student)session.load(Student.class, 102);
		System.out.println(student);
		
		Address address = (Address)session.get(Address.class, 2);
		System.out.println(address.getStreet());
		
		session.close();
		factory.close();
	}
}

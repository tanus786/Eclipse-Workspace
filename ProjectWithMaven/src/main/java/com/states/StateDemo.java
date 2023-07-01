package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Certificate;
import com.tut.Student;

public class StateDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//Object State
		//Transient
		//Persistent
		//Detached
		//Remove
	
		System.out.println("Example");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		//Creating Student Object
		
		Student student = new Student();
		student.setId(1001);
		student.setName("tanu soni");
		student.setCity("delhi");
		student.setCerti(new Certificate("Java Course","2 months"));
		// student in transient state
		
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(student);
		//student in persistent state - session, database
		
		student.setName("Tanu");
		tx.commit();
		session.close();
		//student in detached state
		
		student.setName("Manisha");
		System.out.println(student);
		
		factory.close();
		
	}
}

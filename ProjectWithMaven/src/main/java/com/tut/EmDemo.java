package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Student student1 = new Student();
		student1.setId(100);
		student1.setName("Updesh Pratap");
		student1.setCity("Aligarh");
		Certificate certificate = new Certificate();
		certificate.setCourse("Unity");
		certificate.setDuration("2 Months");
		student1.setCerti(certificate);
		
		Student student2 = new Student();
		student2.setId(200);
		student2.setName("Vanshika");
		student2.setCity("Lucknow");
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Cloud");
		certificate1.setDuration("2 Months");
		student2.setCerti(certificate1);
		
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		
		//Objects save krne hai
		
		session.save(student1);
		session.save(student2);
		
		
		tx.commit();
		session.close();
		factory.close();
	}
}

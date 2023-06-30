package com.tut;

//import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException{
		System.out.println("Project Start");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		Creating Student

		Student st = new Student();
		st.setId(102);
		st.setName("Tanu Soni");
		st.setCity("Varanasi");
		System.out.println(st);

//		Creating object of address class

		Address ad = new Address();
		ad.setStreet("Ausananj varanasi");
		ad.setCity("uttar pradesh");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(0);

//		Reading image
//		FileInputStream fis = new FileInputStream("src/main/java/Snapchat-964565750.jpg");
//		byte[] data = new byte[fis.available()];
//		fis.read(data);
//		ad.setImage(data);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		session.save(ad);
		tx.commit();
		session.close();
		System.out.println("Done");
	}
}

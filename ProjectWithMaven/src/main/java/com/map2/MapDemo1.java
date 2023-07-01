package com.map2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.ChangedCharSetException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.results.graph.collection.internal.EagerCollectionAssembler;

import jakarta.persistence.FetchType;

public class MapDemo1 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		Creating object Of question
//		Question1 question = new Question1();
//		question.setQuestionId(2);
//		question.setQuestion("What Is java?");
////		Creating Answer object
//		Answer1 answer = new Answer1();
//		answer.setAnswerId(16);
//		answer.setAnswer("Java Is programming  language.");
//		answer.setQuestion(question);
//
//		Answer1 answer1 = new Answer1();
//		answer1.setAnswerId(15);
//		answer1.setAnswer("Java Is object oriented.");
//		answer1.setQuestion(question);
//
//		Answer1 answer2 = new Answer1();
//		answer2.setAnswerId(14);
//		answer2.setAnswer("Java is used to create web App.");
//		answer2.setQuestion(question);
//
//		List<Answer1> list = new ArrayList<Answer1>();
//		list.add(answer);
//		list.add(answer1);
//		list.add(answer2);
//		question.setAnswers(list);

//		session
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		// save
//		session.save(answer2);
//		session.save(answer1);
//		session.save(answer);
//		session.save(question);

		
//		fetching data

		Question1 q = (Question1) session.get(Question1.class, 2);
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		
//		Change in FetchType in question1
//		Eager loading
		System.out.println(q.getAnswers().size());
		
//		lazy loading
//		System.out.println(q.getAnswers().size());
		
		
		
		
		
		
//		System.out.println(q.getQuestion());
//		for(Answer1 a : q.getAnswers()) {
//			System.out.println(a.getAnswer());
//		}
		tx.commit();
		session.close();
		factory.close();
	}
}

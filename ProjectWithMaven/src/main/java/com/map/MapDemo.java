package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		Creating object Of question
		Question question = new Question();
		question.setQuestionId(1);
		question.setQuestion("What Is java?");
//		Creating Answer object
		Answer answer = new Answer();
		answer.setAnswerId(11);
		answer.setAnswer("Java Is programming  language.");
		answer.setQuestion(question);
		question.setAnswer(answer);
//		Creating object Of question
		Question question1 = new Question();
		question1.setQuestionId(2);
		question1.setQuestion("What Is a Netbeans?");
//		Creating Answer object
		Answer answer1 = new Answer();
		answer1.setAnswerId(22);
		answer1.setAnswer("Netbeans Is IDE.");
		answer1.setQuestion(question1);
		question1.setAnswer(answer1);

//		session
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(question);
		session.save(question1);
		session.save(answer1);
		session.save(answer);

		tx.commit();
//		fetching data

		Question q = (Question) session.get(Question.class, 2);
		System.out.println(q.getQuestion());
		System.out.println(q.getAnswer().getAnswer());

		session.close();
		factory.close();
	}
}

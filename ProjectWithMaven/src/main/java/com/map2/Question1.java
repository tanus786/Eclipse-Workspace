package com.map2;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question1 {
	@Id
	@Column(name = "question_id1")
	private int questionId;
	private String question;
//For many answer we use list
	@OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
	private List<Answer1> answers;

	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question1(int questionId, String question, List<Answer1> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer1> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer1> answers) {
		this.answers = answers;
	}

}

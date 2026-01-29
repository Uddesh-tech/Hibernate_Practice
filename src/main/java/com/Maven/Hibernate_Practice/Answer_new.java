package com.Maven.Hibernate_Practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Answer_new {
	@Id
	private int ans_id;
	private String answer;
	
	@ManyToOne
	@JoinColumn(name = "q_id") // foreign key
	private Question_new question_new;

	public int getAns_id() {
		return ans_id;
	}

	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Answer_new(int ans_id, String answer) {
		super();
		this.ans_id = ans_id;
		this.answer = answer;
	}

	public Answer_new() {
		super();
		// TODO Auto-generated constructor stub
	}

}

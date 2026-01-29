package com.Maven.Hibernate_Practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {

	@Id
	private int q_id;
	private String q_name;
	
	@OneToOne
	
	private Answer answer;

	public Question(Answer answer) {
		super();
		this.answer = answer;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}

	public String getQ_name() {
		return q_name;
	}

	public void setQ_name(String q_name) {
		this.q_name = q_name;
	}

	public Question(int q_id, String q_name) {
		super();
		this.q_id = q_id;
		this.q_name = q_name;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

}

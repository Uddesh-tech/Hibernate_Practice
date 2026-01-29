package com.Maven.Hibernate_Practice;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question_new {

	@Id
	private int q_id;
	private String q_name;

	@OneToMany(mappedBy = "question_new")
	private List<Answer_new> answer_new;

	public Question_new(int q_id, String q_name, List<Answer_new> answer_new) {
		super();
		this.q_id = q_id;
		this.q_name = q_name;
		this.answer_new = answer_new;
	}

	public Question_new(List<Answer_new> answer_new) {
		super();
		this.answer_new = answer_new;
	}

	public void setAnswer_new(List<Answer_new> answer_new) {
		this.answer_new = answer_new;
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

	public Question_new(int q_id, String q_name) {
		super();
		this.q_id = q_id;
		this.q_name = q_name;
	}

	public Question_new() {
		super();
		// TODO Auto-generated constructor stub
	}

}

package model;

import java.util.List;

public class Question {

	private String qustions;
	
	private List<Answer> answers;

	public String getQustions() {
		return qustions;
	}

	public void setQustions(String qustions) {
		this.qustions = qustions;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
}

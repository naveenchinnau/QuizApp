package com.naveen.QuizApp;

import java.util.List;


public class Question {
	
	private int questionID;
	private String title;
	private int points;
	
	private List<Option> options;
	private int correctOptionID;
	private int userOption;
	
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> option) {
		this.options = option;
	}
	public int getCorrectOptionID() {
		return correctOptionID;
	}
	public void setCorrectOptionID(int correctOptionID) {
		this.correctOptionID = correctOptionID;
	}
	public int getUserOption() {
		return userOption;
	}
	public void setUserOption(int userOption) {
		this.userOption = userOption;
	}
	
	

}

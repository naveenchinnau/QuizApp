package com.naveen.QuizApp;

public class Option {
	private int optionID;
	private String title;
	public Option()
	{
		
	}
	public Option(int optionID,String title)
	{
		this.optionID=optionID;
		this.title=title;
	}
	public int getOptionID() {
		return optionID;
	}
	public void setOptionID(int optionID) {
		this.optionID = optionID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	

}

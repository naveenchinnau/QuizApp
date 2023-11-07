package com.naveen.QuizApp;

public class Admin {
	private String adminID;
	private String password;
	private String firstName;
	private String lastName;
	public String getAdminID() {
		return adminID;
	}
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firdstName) {
		this.firstName = firdstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public static boolean checkPasswordPolicy(String password)
	{
		if(password.length()>=6 && password.length()<=16)return true;
		return false;
	}
	
	public static boolean isAdminExist()
	{
		return false;
	}
	

}

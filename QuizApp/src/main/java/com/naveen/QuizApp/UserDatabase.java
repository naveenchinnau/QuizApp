package com.naveen.QuizApp;

import java.util.ArrayList;

import java.util.List;

public class UserDatabase {
	private static List<Admin> users=new ArrayList<>();;
	public static void defaultUsers()
	{
		
		Admin admin1=new Admin();
		admin1.setAdminID("naveenchinnau@gmail.com");
		admin1.setPassword("1234");
		admin1.setFirstName("Naveen");
		admin1.setLastName("Udutha");
		//--------------------------------------------------------
		Admin admin2=new Admin();
		admin2.setAdminID("admin@gmail.com");
		admin2.setPassword("1122");
		admin2.setFirstName("System");
		admin2.setLastName("User");
		//---------------------------------------------------------
		users.add(admin1);
		users.add(admin2);
	}
public static boolean addUser(String id, String password, String firstName, String lastName)
{
	Admin admin=new Admin();
	admin.setAdminID(id);
	admin.setPassword(password);
	admin.setFirstName(firstName);
	admin.setLastName(lastName);
	users.add(admin);
	return false;
	
}
public List<Admin> users()
{
	defaultUsers();
	return users;
}


}

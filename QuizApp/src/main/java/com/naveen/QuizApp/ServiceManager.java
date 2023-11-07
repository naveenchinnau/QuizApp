package com.naveen.QuizApp;

import java.util.Scanner;

public  class ServiceManager {
	public static  void welcomeNote()
	{
		System.out.println("Wlcome to Quiz Application");
	}
	public static void service() throws InterruptedException,InvalidInputException
	{
		welcomeNote();
		Scanner scan=new Scanner(System.in);
		LoginService login=new LoginService();
		//----------------------------------------------------------------------------------------------------------
		boolean  loginOrCreate=false;;//to store the response whether the user want to login or to create an account. true=signIn and false= create
		try {
		loginOrCreate=login.signInOrSignUp();// calling signInOrSignUp() method to to confirm signInor SignUp/create account
		}
		catch(InvalidInputException e1)
		{
			System.out.println(e1.getMessage());
			System.out.println("Please enter valid input");//asking 2nd time to provide valid input
			try
			{
				loginOrCreate=login.signInOrSignUp();
			}
			catch(InvalidInputException e2)
			{
				throw e2;
			}
		}
		//----------------------------------------------------------------------------------------------------------
		
		if(loginOrCreate)//true-> login and false-> create, and this block will execute only loginOrCreate=true to login account
		{
			
		
		
			try {
				login.userLogin();
				}
			catch(UserNotFoundException e1)
			{
				System.out.println(e1.getMessage());
				System.out.println("If you want to try again, enter 'yes' else enter any key to close the Application");
				String response=scan.next();
				if(response.equals("yes"))
					{
						try {
								login.userLogin();
							}
						
						catch(UserNotFoundException e2)
							{
								System.out.println(e2.getMessage());
								
							}
						
					}
			}
			

		}
		else//this block will execute only when loginOrCreate=false to create account
		{
			if(login.createAccount())
			{
				try {
					login.userLogin();
					}
				catch(UserNotFoundException e1)
				{
					System.out.println(e1.getMessage());
					System.out.println("If you want to try again, enter 'yes' else enter any key to close the Application");
					String response=scan.next();
					if(response.equals("yes"))
						{
							try {
									login.userLogin();
								}
							
							catch(UserNotFoundException e2)
								{
									System.out.println(e2.getMessage());
								}
						}
				}
				

			}
			
		}
	}

}

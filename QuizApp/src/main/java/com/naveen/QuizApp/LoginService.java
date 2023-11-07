package com.naveen.QuizApp;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class LoginService {
	//---------------------------------------------------------------------------------------------
	public static boolean userLogin() throws InterruptedException
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcom to Quiz Application");
		System.out.println();
		Thread.sleep(1000);
		System.out.println("Hello Admin ");

			System.out.println("Please Enter your ID");
			String adminID=scan.next();
			System.out.println("Please Enter your password");
			String password=scan.next();
			
			if(isUserExist(adminID,password))
			{
				
				
				System.out.println("To add new questions enter 'add' else enter any other key to skip");
				String response=scan.next();
				if(response.equals("add"))
				{
						QuestionListFromDatabase.addQuestions();
						System.out.println("DO you want to start the quiz? enter 'yes' to start the quiz or enter any key to exit");
						String startQuiz=scan.next();
						if(startQuiz.equals("yes"))
						{
							QuizService.showRules();
							QuizService.startQuiz();
							
							
						}

						
				}
				else  {
					
					System.out.println("DO you want to start the quiz? enter 'yes' to start the quiz or enter any key to exit");
					String startQuiz=scan.next();
					if(startQuiz.equals("yes"))
					{
						QuizService.showRules();
						QuizService.startQuiz();
						
						
					}

					
				}
			}
			else
			{
				throw new UserNotFoundException("Invalid Username or password");
			}
			

			return false;
		
	}
	//-----------------------------------------------------------------------------------------
	public static boolean isUserExist(String id,String password)
	{
		
		UserDatabase database=new UserDatabase();
		List<Admin> users=database.users();
		
		Iterator<Admin> iterator=users.iterator();
		while(iterator.hasNext())
		{
			Admin admin=iterator.next();
			if(admin.getAdminID().equals(id) && admin.getPassword().equals(password))
			{
				System.out.println("Hello "+admin.getFirstName()+" "+admin.getLastName()+" !");
				return true;
			}
		}
		return false;
		
	}
	//----------------------------------------------------------------------------------------
	public boolean createAccount()
	{
		//feature to be added
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter  your email ID");
		String adminID=scanner.next();
		
		System.out.println("Enter password");
		String password=scanner.next();
		
		System.out.println("Enter First Name");
		String firstName=scanner.next();
		
		System.out.println("Enter Last Name");
		String lastName=scanner.next();
		
		System.out.println("account created");
		

		UserDatabase.addUser(adminID, password, firstName, lastName);
		return true;
		
	}
	//------------------------------------------------------------------------------------------
	public boolean signInOrSignUp()//this method will return 'true'->SignIN  or 'false'->Create account
	{
		
		System.out.println("enter 'yes' to signIn or 'create' to create account");
		Scanner scanner=new Scanner(System.in);
		String response=scanner.next();
		if(response.equals("yes")||response.equals("create"))
		{
			
			if(response.equals("yes"))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		else 
		{
			throw new InvalidInputException("Invalid Input");
		}
	}


}

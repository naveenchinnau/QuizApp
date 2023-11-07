package com.naveen.QuizApp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		try
		{
			ServiceManager.service();
		}
		
		catch(InvalidInputException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		finally
		{
			System.out.println("Thank you for using the Application");
		}
		
    }
}

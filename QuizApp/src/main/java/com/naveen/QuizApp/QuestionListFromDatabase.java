package com.naveen.QuizApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuestionListFromDatabase {
	
	private static List<Question> questionList=new ArrayList<>();;
	
	public boolean setQuestions()
	{
		Question question1=new Question();
				question1.setQuestionID(101);
				question1.setTitle("What is the entry point for a Java application?");
				
		List<Option> option1=new ArrayList<>();		
		option1.add(new Option(1,"main"));
		option1.add(new Option(2,"start"));		
		option1.add(new Option(3,"run"));
		option1.add(new Option(4,"execute"));
		
		question1.setCorrectOptionID(option1.get(0).getOptionID());//or we can mention ID directly
		question1.setOptions(option1);

		//--------------------------------------------------------------------------------------
		
		Question question2=new Question();
		question2.setQuestionID(102);
		question2.setTitle("Which keyword is used to define a constant variable in Java?");
		
		List<Option> option2=new ArrayList<>();		
		option2.add(new Option(1,"final"));
		option2.add(new Option(2,"static"));		
		option2.add(new Option(3,"const"));
		option2.add(new Option(4,"var"));

		question2.setCorrectOptionID(option2.get(0).getOptionID());
		question2.setOptions(option2);

		//--------------------------------------------------------------------------------------
		Question question3=new Question();
		question3.setQuestionID(103);
		question3.setTitle("Which Java data type is used to store text or a sequence of characters?");
		
		List<Option> option3=new ArrayList<>();		
		option3.add(new Option(1,"int"));
		option3.add(new Option(2,"boolean"));		
		option3.add(new Option(3,"String"));
		option3.add(new Option(4,"double"));

		question3.setCorrectOptionID(option3.get(2).getOptionID());
		question3.setOptions(option3);

		//--------------------------------------------------------------------------------------
		Question question4=new Question();
		question4.setQuestionID(104);
		question4.setTitle("Which keyword is used to refer to the object of the current class in Java?");
		
		List<Option> option4=new ArrayList<>();		
		option4.add(new Option(1,"self"));
		option4.add(new Option(2,"this"));		
		option4.add(new Option(3,"myClass"));
		option4.add(new Option(4,"current"));

		question4.setCorrectOptionID(option4.get(1).getOptionID());
		question4.setOptions(option4);

		//--------------------------------------------------------------------------------------
		Question question5=new Question();
		question4.setQuestionID(105);
		question5.setTitle("What is the default value of a boolean variable in Java if it's not explicitly initialized?");
		
		List<Option> option5=new ArrayList<>();		
		option5.add(new Option(1,"false"));
		option5.add(new Option(2,"0"));		
		option5.add(new Option(3,"null"));
		option5.add(new Option(4,"true"));

		question5.setCorrectOptionID(option5.get(0).getOptionID());
		question5.setOptions(option5);

		//--------------------------------------------------------------------------------------
		
		
		questionList.add(question1);
		questionList.add(question2);
		questionList.add(question3);
		questionList.add(question4);
		questionList.add(question5);
		
		
		return true;
		
	}
	
	public List<Question> getQuestions()
	{
		setQuestions();
		return questionList;
	}
	public static void addQuestions()
	{
		Scanner scan=new Scanner(System.in);
		boolean addMore=true;
		int questionID=105;
		while(addMore)
		{
			Question question=new Question();
			question.setQuestionID(questionID++);
			System.out.println("Enter the Question title");
			question.setTitle(scan.nextLine());
			
			List<Option> option=new ArrayList<>();
			System.out.println("______________________________");
			System.out.println("Please provide  4 options");
			System.out.println("______________________________");
			
			System.out.println("Enter the 1'st option");
			String op1=scan.nextLine();
			
			System.out.println("Enter the 2'nd option");
			String op2=scan.nextLine();
			
			System.out.println("Enter the 3'rd option");
			String op3=scan.nextLine();
			
			System.out.println("Enter the 4'th option");
			String op4=scan.nextLine();
			
			System.out.println("Please enter the correction option number");
			System.out.println("1 -> "+op1);
			System.out.println("2 -> "+op2);
			System.out.println("3 -> "+op3);
			System.out.println("4 -> "+op4);
			
			int currectopID=scan.nextInt();
			question.setCorrectOptionID(currectopID);
			
			option.add(new Option(1,op1));
			option.add(new Option(2,op2));		
			option.add(new Option(3,op3));
			option.add(new Option(4,op4));
			question.setOptions(option);
			questionList.add(question);
			
			
			System.out.println("enter 'yes' to add more or any key to go start the Quiz");
			if(!scan.next().equals("yes"))
			{
				addMore=false;
			}
			
			
			
		}
		
	}
	

}

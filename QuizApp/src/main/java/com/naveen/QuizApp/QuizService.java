package com.naveen.QuizApp;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuizService {
	public static void showRules() 
	{
		String r1="There are 5 questions";
		String r2="Each question will have 4 options, choose the correct option";
		String r3="For correct answer you will get +2 marks";
		String r4="For wrong answer you will get -1 marks";
		String r5="If you skip the quetion you will get 0 marks";
		String r6="Result will be calculated and shown at the end";
		System.out.println("________________________Instructions_______________________________________________________");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println("___________________________________________________________________________________________");
	}
	
	public static void startQuiz()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Hellow Student, Please enter your ID");
		String studentID=scan.next();
		System.out.println("Please enter your First Name");
		String firstName=scan.next();
		System.out.println("Please enter your Last Name");
		String lastName=scan.next();
		
		Student student=new Student();
		student.setStudentID(studentID);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		System.out.println("launching the quiz in 2 seconds");
		System.out.println();
		System.out.println();
		try {
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		showRules();
		System.out.println();
		QuestionListFromDatabase qlist=new QuestionListFromDatabase();

		List<Question> list=qlist.getQuestions();
		for(int i=0;i<list.size();i++)
		{
			System.out.println((i+1)+". "+list.get(i).getTitle());//Question
			
			Collections.shuffle(list.get(i).getOptions());
			char c='a';
			for(int j=0;j<list.get(i).getOptions().size();j++)
			{
				System.out.print("     ");
				System.out.print(c++ +") ");
				System.out.print(list.get(i).getOptions().get(j).getTitle());
				
			}
			System.out.println();
			System.out.println("please enter your option,to skip enter 'skip' or any other key");
				String userOption=scan.next();
				switch(userOption)
				{
					case "a"->
					{
						if(list.get(i).getOptions().get(0).getOptionID()==list.get(i).getCorrectOptionID())
						{
							list.get(i).setPoints(2);
							
						}
						else list.get(i).setPoints(-1);
					}
					case "b"->
					{
						if(list.get(i).getOptions().get(1).getOptionID()==list.get(i).getCorrectOptionID())
						{
							list.get(i).setPoints(2);
						}
						else list.get(i).setPoints(-1);
					}
					case "c"->
					{
						if(list.get(i).getOptions().get(2).getOptionID()==list.get(i).getCorrectOptionID())
						{
							list.get(i).setPoints(2);
						}
						else list.get(i).setPoints(-1);
						
					}
					case "d"->
					{
						if(list.get(i).getOptions().get(3).getOptionID()==list.get(i).getCorrectOptionID())
						{
							list.get(i).setPoints(2);
						}
						else list.get(i).setPoints(-1);
						
					}
					case "skip"->
					{
						list.get(i).setPoints(0);
					}
					default->
					{
						list.get(i).setPoints(0);
					}
			
				}
			
		}
		

		//calculating Result
		int score=calculateResult(list);
		
		student.setMarks(score);
		System.out.println("quiz has ended");
		System.out.println("Your score : "+score);
	}
	
	public static int calculateResult(List<Question> list)
	{
		int score=0;
		for(Question q:list)
		{
			score=score+q.getPoints();
		}

		return score;
	}
}

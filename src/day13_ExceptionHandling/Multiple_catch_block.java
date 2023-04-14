package day13_ExceptionHandling;

import java.util.Scanner;

public class Multiple_catch_block {

	public static void main(String[] args) 
	{
	
		System.out.println("Program is started....");
		
		System.out.println("Program is in progress....");
		
		//Example 1
		Scanner sc=new Scanner(System.in);
		//System.out.println("Input a number :");
		
		//int num=sc.nextInt();
		String s=null;
		
		/*
		try
		{

		System.out.println(100/num);//Arithmetic Exception	
		System.out.println(s.length());
		}
		catch(ArithmeticException e) 
		{
			e.printStackTrace(); 
			System.out.println(e.getMessage()); 
			System.out.println("You have entered wrong input.");
		}
		catch(NumberFormatException e) //
		{
			e.printStackTrace(); 
			System.out.println(e.getMessage()); 
			System.out.println("You have entered wrong input.");
		}
		catch(NullPointerException e) 
		{
			e.printStackTrace(); 
			System.out.println(e.getMessage()); 
			System.out.println("You have entered wrong input for string length.");
		}
		*/
		try
		{
		System.out.println(s.length());
		}
		catch(Exception e) //to handle all exception use Exception
		{
			e.printStackTrace(); 
			System.out.println(e.getMessage()); 
			System.out.println("You have entered wrong input.");
		}
		
		
		System.out.println("Entered Catch block");
		
		
		System.out.println("Program started...");
		System.out.println("Program is in progress....");
		
		
		
		
		

	}

}

package day13_ExceptionHandling;

import java.util.Scanner;

public class UncheckedException_handling {

	public static void main(String[] args) 
	{
		System.out.println("Program is started....");
		
		System.out.println("Program is in progress....");
		
		//Example 1
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a number :");
		
		int num=sc.nextInt();
		
		try
		{

		System.out.println(100/num); //Arithmetic Exception	
		}
		catch(ArithmeticException e) //approach 1
		{
			e.printStackTrace(); /// by zero
			System.out.println(e.getMessage()); 
			System.out.println("You have entered wrong input.");
		}
	
		System.out.println("Entered Catch block");
		
		
		System.out.println("Program started...");
		System.out.println("Program is in progress....");
		
		
		

	}

}

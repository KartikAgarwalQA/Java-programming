package day13_ExceptionHandling;

import java.util.Scanner;

public class Exception_Demo {

	public static void main(String[] args) 
	{
		System.out.println("Program is started....");
		
		System.out.println("Program is in progress....");
		
		//Example 1
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a number :");
		
		int num=sc.nextInt();
		
		

		System.out.println(100/num); //Arithmetic Exception	
	
	
		System.out.println("Entered Catch block");
		
		
		System.out.println("Program started...");
		System.out.println("Program is in progress....");
		
		
		//Example 2
		System.out.println("2 Program is starting....");
		
		System.out.println("2 Program is in Progress....");
		
		int a[]=new int[5];//0..1..2..3..4
		System.out.println("Enter a number to assign in array:");
		int num1 =sc.nextInt();
		
	
		System.out.println("Enter index of array");  //ArrayOutofIndex
	
		
		int arridx=sc.nextInt();
		a[arridx]=num1;
		System.out.println(a[arridx]);
		
		System.out.println("2 Program started...");
		System.out.println("2 Program is in progress....");
		
		
		//Example3
		String s="welcome";
		int num2=Integer.parseInt(s); //NumberFormatException
		System.out.println(num2);
		
		
		
		
	}

}

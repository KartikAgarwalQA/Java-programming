package frequentlyAskedQues;

import java.util.Scanner;

public class SamplePractice {

	public static void main(String[] args) 
	{
		/*
		String str="madam";
		String rev="";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev =rev+str.charAt(i);
			
		}
		
		System.out.println("Reversed String:"+rev);
		
		
		if(str.equals(rev))
		{
			System.out.println("Palindrome String");
		
		}
		
		else
		{
			System.out.println("Not a palindrome String");
		}
		*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num= sc.nextInt();
		
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("Reversed number:"+ rev);
		
		if(num==rev)
		{
			System.out.println("It is palindrome number.");
		}
		else
		{
			System.out.println("Not a palindrome number.");
		}
	}

}

package frequentlyAskedQues;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		
		String str=sc.next();
		String org_str=str;
		
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		//System.out.println(rev);
		
		if(org_str.equals(rev))
		{
			System.out.println(rev+"	"+"is a palindrome number.");
		}
		
		else
		{
			System.out.println(rev+"	"+"is not a palindrome number.");
		}

	}

}

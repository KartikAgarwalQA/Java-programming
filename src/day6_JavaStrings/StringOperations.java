package day6_JavaStrings;

public class StringOperations {

	public static void main(String[] args) 
	{
		String s="Welcome";
		String s1=new String("Welcome");
		
		System.out.println(s);
		System.out.println(s1);
		
		//length() -returns length of string
		System.out.println(s.length());
		System.out.println(s1.length());
		
		//concat() - join two strings
		String s2="Welcome";
		String s3="to automation";
		String s4="using java.";
		
		System.out.println(s2.concat(s3));
		System.out.println(s2+s3);
		
		System.out.println(s2+s3+s4);
		System.out.println(s2.concat(s3).concat(s4));
		
		//trim()- remove left and right blank/white spaces
		String se="  automation  ";
		System.out.println("before trim:"+se.length());
		System.out.println("After trim:"+se.trim().length());
		
		//charAt()- returns a single character based on index we passed
		//index count starts from 0
		
		s1="welcome";
		System.out.println(s1.charAt(0));//w
		System.out.println(s1.charAt(6));//e
		
		//contains()- returns seq present or not in boolean.
		System.out.println(s1.contains("wel")); //true
		System.out.println(s1.contains("Wel")); //false -case sensitive
		System.out.println(s1.contains("out")); //false
		
		//equals() and equalsIgnoreCase() - compare 2 strings
		
		String s10="Welcome";
		String s11="welcome";
		
		System.out.println(s10.equals(s11)); //false
		System.out.println(s10.equalsIgnoreCase(s11)); //true
		
		//replace() - replace single/multiple characters in a string
		String s12="Welcome to Demo.";
		
		System.out.println(s12.replace('e', 'X'));
		
		//substring() - to extract substring from main string
		
		System.out.println(s10.substring(0, 2)); //Wel
		System.out.println(s10.substring(3, 7)); //come
		
		//split() - divide the strings into multiple parts using delimeter
		// should not use * $ ^ ? . + -
		
		String s13="Abc@gmail.com";
		
		String s1123[]=s13.split("@");
		
		System.out.println(s1123[0]);
		System.out.println(s1123[1]);
		
		//toUpperCase() & toLowerCase() 
		System.out.println(s13.toUpperCase());
		System.out.println(s13.toLowerCase());
 				
		
	
		
		
	}

}

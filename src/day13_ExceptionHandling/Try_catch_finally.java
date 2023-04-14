package day13_ExceptionHandling;

public class Try_catch_finally {

	public static void main(String[] args) 
	{
		
		System.out.println("Program is started....");
		
		System.out.println("Program is in progress....");
		String s=""; //case 3
		
		/*
		 * 	case1: Exception occured, catch block handled ---> finally block will execute
			case2: Exception occured, catch block NOT handled --> finally block will execute
			case3: Exception does not occured, catch block ignored ----> finally block will execute
		 * 
		 */
		
		try
		{
		System.out.println(s.length());
		}
		catch(ArithmeticException e) // Case 1 -- Case 2
		{
			//e.printStackTrace(); 
			//System.out.println(e.getMessage()); 
			System.out.println("You have entered wrong input.");
		}
		finally
		{
			System.out.println("Entered Finally block");
		}
		
		System.out.println("Program started...");
		System.out.println("Program is in progress....");
		
		

	}

}

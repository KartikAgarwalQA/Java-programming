package day13_ExceptionHandling;

public class Checked_ExceptionHandling {

	public static void main(String[] args) throws InterruptedException //Approach2 : using throws keyword
	{
		
		System.out.println("Program Started");
		System.out.println("Program in progress");
		
		//Approach 1 : using try catch
		/*
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Checked exception : InterruptedException
		*/
		
		Thread.sleep(5000);
		
		System.out.println("Program ended");
		

	}

}

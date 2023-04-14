package day3_JavaConditional_Statements;

public class Assignment_largest2_number {

	public static void main(String[] args) 
	{
	
		int a=200,b=400;
		
		/*
		if(a>b)
		{
			System.out.println("a is the largest number:"+a);
		}
		
		else
		{
			System.out.println("b is the largest number:"+b);
		}
		*/
		
		//Ternary
		
		int x=a>b?a:b;
		System.out.println("the largest number:"+x);
		
	
		
		
		
	}

}

package day3_JavaConditional_Statements;

public class If_Else_largest_three_number {

	public static void main(String[] args) 
	{
		
		int a=30000,b=4000,c=500;
		
		if(a>b && a>c)
		{
			System.out.println("a is the largest number:"+ a);
			
		}
		
		else if(b>a && b>c)
		{
			System.out.println("b is the largest number:"+ b);
		}
		
		else
		{
			System.out.println("c is the largest number:"+ c);
			
		}

	}

}

package day2_JavaOperators;

public class Ternary_OR_Conditional_operators {

	public static void main(String[] args) 
	{	
		//var=expression ? result1 : result2;
		
		int a=200,b=100;
		
		int x=a>b?a:b;
		
		System.out.println(x);
		
		int a1=1000,b1=500;
		int y=b1>a1?a1:b1;
		System.out.println(y);
		
	
		x=(1==1)?100:200;
		System.out.println(x); //100
		
		//Example
		int age=17;
		String Elg =(age>=18)?"Eligible to vote":"Not Eligible to Vote";
		System.out.println(Elg);
		
		
		

	}

}

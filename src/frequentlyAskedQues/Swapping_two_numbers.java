package frequentlyAskedQues;

public class Swapping_two_numbers {

	public static void main(String[] args) 
	{
			
		int a=10,b=20;
		
		System.out.println("Before swapping values are..... a:"+a+"	"+"b:"+b);
		
		//logic 1 - using third variable
		/*int t=a;  //t=10
		a=b;//a=20
		b=t;//b=10*/
		
		//logic 2 - using + and - (without using third variable)
		/*a=a+b;//30
		b=a-b;//10
		a=a-b;//20*/
		
		//logic 3 - using * and / (without using third variable)
		//here a and b should not be zero
		/*a=a*b;//200
		b=a/b; //10
		a=a/b; //20*/
		
		//logic 4 - bitwise XOR (^)
		/*a=a^b;//30
		b=a^b;//10
		a=a^b;//20*/
		
		//logic5 (a=10,b=20)
		b=a+b-(a=b);  // first bracket = 20 assigned to a (20) , 10+20=30 --> b=30-20=10 and a remains 20
		
		System.out.println("After swapping values are..... a:"+a+"	"+"b:"+b);
	}

}

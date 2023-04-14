package day2_JavaOperators;

public class Increment_DecrementOperators {

	public static void main(String[] args) 
	{
		//---Increment operators : ++ is increment -> pre-increment & post-increment
		
		int a=10;
		//scenario 1- no difference btw pre and post increment.
		//a++;
		++a;
		System.out.println(a);  //11 -same result
		
		
		//scenario 2
		
		//int res=a++;
		int res1=++a;
		
		//System.out.println(res);//10
		System.out.println(res1);//11
		
		//---Decrement operators : -- is decrement -> pre-decrement & post-decrement
		
		int b=20;
		
		//scenario1 - no differnece btw pre and post
		//b--;
		//--b;
		System.out.println(b);
		
		
		//scenario 2 - 
		//int res2=b--;
		int res3=--b;
		//System.out.println(res2);//20
		System.out.println(res3);//19
		
		
		
		
		

	}

}

package day9_Encapsulation_settergetter_Static_kywrd;

public class Static_Main 

{

	public static void main(String[] args) 
	{
		//static methods can access static stuff directly(without objects)
		//System.out.println(a); //Now cannot access directly 
		
		System.out.println(StaticKeywordDemo.a); //refer class name
		
		// System.out.println(b); //Incorrect as b is non-static varaiable
		
		//static methods can be called directly without objects
		StaticKeywordDemo.m1();
		
		//m2().    //non-static methods cannot be called directly without objects.
		
		//2) static methods can access non-static stuff through object
		
		StaticKeywordDemo stat=new StaticKeywordDemo();
		System.out.println(stat.b);
		
		stat.m2();
		
		
		

	}
	
	
	
	
	
	
	
	
	
}

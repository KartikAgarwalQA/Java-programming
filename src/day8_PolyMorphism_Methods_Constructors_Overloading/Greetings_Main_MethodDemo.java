package day8_PolyMorphism_Methods_Constructors_Overloading;

public class Greetings_Main_MethodDemo {

	public static void main(String[] args) 
	{
		GreetingsBC_MethodDemo greet=new GreetingsBC_MethodDemo();
		greet.greeting1();
		
		//String str =greet.greeting2();
		//System.out.println(str);
		
		System.out.println(greet.greeting2());
		
		greet.greeting3("QA");
		
		System.out.println(greet.greeting4("QA rookie"));
		
	}

}

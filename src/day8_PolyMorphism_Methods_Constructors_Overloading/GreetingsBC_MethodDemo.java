package day8_PolyMorphism_Methods_Constructors_Overloading;

public class GreetingsBC_MethodDemo 
{

	//No Params No return value
	void greeting1()
	{
		System.out.println("Hello Test1");
	}
	
	
	//No params returns value
	 String greeting2()
	 {
		return "Hi Test2";
	 }
	
	 //Params no return value
	 
	 void greeting3(String name)
	 {
		 System.out.println("Hello"+name);
	 }
	
	 //Params with return value
	 
	 String greeting4(String name)
	 {
		 return "Hello ....Hi"+name;
	 }
	
	
}

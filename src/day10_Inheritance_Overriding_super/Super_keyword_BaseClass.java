package day10_Inheritance_Overriding_super;

class Animal
{
	String color="Red";
	
	void eat()
	{
		System.out.println("Test 1.........");
	}
}

class Bird extends Animal
{
	String color="black";
	void color()
	{
		System.out.println(super.color);  //display parent class variable
		
	}
	
	
	void eat()
	{
		//System.out.println("Test 2.........");
		super.eat(); //to invoke parent class method
	}
}




public class Super_keyword_BaseClass 
{

}

package day10_Inheritance_Overriding_super;

public class Super_keyword_MainClass {

	public static void main(String[] args) 
	{
		Bird brd=new Bird();
		System.out.println(brd.color); //display color of child class
		
		brd.color(); //display color of parent class
		
		brd.eat(); //display parent class method
		
		
		
		

	}

}

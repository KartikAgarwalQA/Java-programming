package day11_Interface_final_keyword;

final class QA1
{
	final void m1()
	{
		System.out.println("This is method from method m1");
	}
}

class QA2 extends QA1  //class-level final will throw error
{
	void m1()  //cannot overrirde final method
	{
		System.out.println("This is method from method m2");
	}
}



public class FinalKeyword_method_level {

	public static void main(String[] args) 
	{
		
		
		
		
		
		
		
		
		

	}

}

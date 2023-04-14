package day8_PolyMorphism_Methods_Constructors_Overloading;

public class ConstructorDemo 
{

	int x,y;
	String s;
	
	ConstructorDemo()  //default constructor
	{
		x=100;
		y=200;
		s="welcome";
	}
	
	ConstructorDemo(int a,int b,String z)  //parameterized constructor
	{
		x=a;
		y=b;
		s=z;
	}
	
	
	void displaydata()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}
	
	
	
	public static void main(String[] args) 
	{
		
		ConstructorDemo ctr=new ConstructorDemo();  //invoking default constructor
		ctr.displaydata();
		
		ConstructorDemo ctr1=new ConstructorDemo(12,13,"QA"); //invoking parameterized constructor
		ctr1.displaydata();
		

	}

}

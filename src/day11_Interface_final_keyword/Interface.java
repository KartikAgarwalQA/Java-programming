package day11_Interface_final_keyword;

interface Shape
{
	int length=12;  //final and static variables by default
	int width=23;	//final and static variables by default
	
	void m1(); //Abstract method with no definition and implementation
	
	default void m2()   //need to add default OR STATIC keyword even if there is implementation
	{
		System.out.println("This is a square - DEFAULT METHOD");
	}
	
	
	static void m3()      //STATIC method
	{
		System.out.println("This is a circle - STATIC METHOD");
	}
	
}

public class Interface implements Shape  //will throw error to add unimplementedmethods 
{
	public void m1()   //need to change visiblity to public for abstracted methods as they are hidden in nature
	{
		System.out.println("This is Rectangle - ABSTRACT METHOD");
	}
	
	public static void main(String[] args) 
	{
		
		Interface iobj=new Interface();
		
		iobj.m1();
		iobj.m2();
		
		Shape.m3();  //static method need to be accessed directly from class/Interface
		
		//Shape shp=new Shape();  //Error - We can create Object reference for Interface but we cannot instantiate interface.
		
		Shape shp=new Interface(); //A class extends another class, an interface extends another interface but a class implements an interface.
		shp.m1();
		shp.m2();
		
		

	}

}

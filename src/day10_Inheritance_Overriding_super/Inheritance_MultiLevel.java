package day10_Inheritance_Overriding_super;

class A //parent
{
	int a=12;
	void show()
	{
		System.out.println(a);
	}
	
}

class B extends A //child
{
	int b=16;
	void display()
	{
		System.out.println(b);
	}
	
}

class C extends B  //grandchild
{
	int c=19;
	void print()
	{
		System.out.println(c);
	}
	
}

public class Inheritance_MultiLevel {

	public static void main(String[] args) 
	
	{
		
		C cbj=new C();
		System.out.println(cbj.a);
		cbj.show();

		System.out.println(cbj.b);
		cbj.display();
		
		System.out.println(cbj.c);
		cbj.print();

	}

}

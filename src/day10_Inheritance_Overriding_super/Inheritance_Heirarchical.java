package day10_Inheritance_Overriding_super;

class Parent  //Single Parent multiple childs
{
	int a=1;
	void display()
	{
		System.out.println(a);
	}
}

class Child1 extends Parent
{
	int b=10;
	void show1()
	{
		System.out.println(b);
	}
}

class Child2 extends Parent
{
	int c=12;
	void show2()
	{
		System.out.println(c);
	}
}


public class Inheritance_Heirarchical 
{

	public static void main(String[] args) 
	{
		
		Child1 cb1=new Child1();
		System.out.println(cb1.a);
		System.out.println(cb1.b);
		cb1.display(); //parent method
		cb1.show1(); //child method own
		
		
		Child2 cb2=new Child2();
		System.out.println(cb2.a);
		System.out.println(cb2.c);
		cb2.display(); //parent method
		cb2.show2(); //child method own
		
		

	}

}

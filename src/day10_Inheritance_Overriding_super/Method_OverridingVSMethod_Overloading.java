package day10_Inheritance_Overriding_super;

class A12
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}

class B12 extends A12
{
	void m1(int a)
	{
		System.out.println(a*a);//Over-rided Method
	}
	
	void m2(int a,int b)		//Over-loaded method
	{
		System.out.println(a+b);  
	}
}



public class Method_OverridingVSMethod_Overloading 
{

	public static void main(String[] args) 
	{
		B12 obj=new B12();
		obj.m1(10);
		obj.m2(12);
		obj.m2(13, 15);

	}

}

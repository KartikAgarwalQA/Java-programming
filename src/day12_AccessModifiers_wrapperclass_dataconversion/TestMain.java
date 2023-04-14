package day12_AccessModifiers_wrapperclass_dataconversion;

public class TestMain 
{

	
	
	
	
	
	public static void main(String[] args) 
	{
		//default method can be accessed within package outside class
		Test obj=new Test();
		System.out.println(obj.x);
		obj.m1();
		
		
		//private -access only within class throwing error
		/*
		Test obj1=new Test();
		System.out.println(obj1.y);
		obj.m2();
		*/
		
		//public can be accessed everywhere outside class/package.
		Test obj1=new Test();
		System.out.println(obj1.a);
		obj.m4();
		
	}

}

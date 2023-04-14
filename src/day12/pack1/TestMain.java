package day12.pack1;

import day12_AccessModifiers_wrapperclass_dataconversion.Test;

public class TestMain extends Test
{
	public static void main(String[] args) 
	{
		//default cannot be accessed outside of package
		/*
		Test obj=new Test();
		System.out.println(obj.x);
		obj.m1();
		*/
		
		//protected variables/methods can be accessed by inheritance
		// and importing parent package by creating object of 
		
		TestMain ob=new TestMain();
		System.out.println(ob.z);
		ob.m3();
		
		//public can be accessed everywhere
		System.out.println(ob.a);
		ob.m4();
		
		
		
	}

}

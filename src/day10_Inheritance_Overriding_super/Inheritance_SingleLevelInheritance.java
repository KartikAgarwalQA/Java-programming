package day10_Inheritance_Overriding_super;

//Single inheritance

class ParentA
{
	int a=10;
	
	void display()
	{
		System.out.println(a);
	}
}



class ChildB extends ParentA
{
	int b=12;
	
	void show()
	{
		System.out.println(b);
	}
	
	
}


public class Inheritance_SingleLevelInheritance 
{
	
	public static void main(String[] args) 
	{
		ChildB bobj=new ChildB();
		System.out.println(bobj.a);
		bobj.display();
		
		System.out.println(bobj.b);
		bobj.show();
		

	}

}

package day8_PolyMorphism_Methods_Constructors_Overloading;

public class MethodOverloading 
{

	int x,y,z;
	double m;
	
	void sum()
	{
		x=1;
		y=2;
		z=3;
		m=10.5;
		System.out.println(x+y+z+m);
	}
	
	void sum(int a,int b)
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
	
	void sum(int a,double b)
	{
		x=a;
		m=b;
		System.out.println(x+m);
	}
	
	void sum(double a,int b)
	{
		m=a;
		x=b;
		System.out.println(m+x);
	}
	
	
	public static void main(String[] args) 
	{
		MethodOverloading mo=new MethodOverloading ();
		mo.sum();
		
		mo.sum(1, 2);
		mo.sum(2, 12.1);
		mo.sum(1.2, 12);

	}

}

package day8_PolyMorphism_Methods_Constructors_Overloading;

public class ConstructorOverloading_poly 
{
	int x,y,z;
	double d;
	ConstructorOverloading_poly () //1
	{
		x=10;
		y=23;
		
	}
	
	ConstructorOverloading_poly (int a,int b) //2
	{
		x=a;
		y=b;
		
	}
	
	ConstructorOverloading_poly (int a,double b) //3
	{
		x=a;
		d=b;
		
	}
	
	ConstructorOverloading_poly (double a,int b) //4
	{
		d=a;
		x=b;
		
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(d);
	}
	
	public static void main(String[] args) 
	{
		ConstructorOverloading_poly cons=new ConstructorOverloading_poly(); //1
		cons.display();
		
		ConstructorOverloading_poly cons2=new ConstructorOverloading_poly(23,23); //2
		cons2.display();
		
		ConstructorOverloading_poly cons3=new ConstructorOverloading_poly(23,23.324); //3
		cons3.display();
		
		ConstructorOverloading_poly cons4=new ConstructorOverloading_poly(23.343434,23); //4
		cons4.display();

	}

}

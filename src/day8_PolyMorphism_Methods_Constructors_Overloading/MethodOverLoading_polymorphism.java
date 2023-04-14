package day8_PolyMorphism_Methods_Constructors_Overloading;

public class MethodOverLoading_polymorphism 
{
	int x,y,z;
	double q;
	void sum()  //1 -default method
	{
		x=1;
		y=2;
		z=3;
		q=10.5;
		System.out.println(x+y+z+q);
	}
	
	 void sum(int a,int b)  // 2nd method
	 {
		 x=a;
		 y=b;
		
		 System.out.println(x+y);
	 }
	
	 void sum(int a,double b) //3rd method
	 {
		 x=a;
		 q=b;
		
		 System.out.println(x+q);
	 }
	 
	 void sum(double a,int b) //4th method
	 {
		 q=a;
		 x=b;
		
		 System.out.println(q+x);
	 }
	
	
	
	public static void main(String[] args) 
	{
		
		MethodOverLoading_polymorphism ovr=new MethodOverLoading_polymorphism();
		ovr.sum();  //default method invoke
		
		ovr.sum(10, 20); //2nd method
		
		ovr.sum(23, 2.023); //3rd
		
		ovr.sum(70.45, 56); //4th 
				
		
		

	}

}

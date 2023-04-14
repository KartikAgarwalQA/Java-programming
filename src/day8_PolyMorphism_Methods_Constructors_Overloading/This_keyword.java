package day8_PolyMorphism_Methods_Constructors_Overloading;

public class This_keyword 
{

	int x,y;  //instance variables/class variables
	
	void setData(int x,int y) //local variables//method variables 
	{							
		this.x=x;				//Method
		this.y=y;
	}
	
	This_keyword(int x,int y)  //Constructor
	{
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	
	
	
	public static void main(String[] args) 
	
	{
		/*
		This_keyword th=new This_keyword();
		th.setData(2, 4);
		th.display();
		*/
		This_keyword th=new This_keyword(2,3);
		th.display();
		
		

	}

}

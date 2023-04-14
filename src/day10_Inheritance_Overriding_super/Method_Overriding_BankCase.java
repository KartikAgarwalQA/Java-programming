package day10_Inheritance_Overriding_super;

class Bank  //parent class definition  //heirarchichal inheritance
{
	double roi()  //parent class method
	{
		return 0.0; //returning some value which will vary in child classes
	}
}

class Axis extends Bank  //
{
	double roi()  //definition same
	{
		return 8.0;		//logic/implementation different as return value changes
	}
}						//This is Method Overriding.	

class ICICI extends Bank
{
	double roi()
	{
		return 9.0;
	}
}

class HDFC  extends Bank
{
	double roi()
	{
		return 10.0;
	}
}

public class Method_Overriding_BankCase {

	public static void main(String[] args) 
	{
		//
		Axis axis=new Axis();
		System.out.println(axis.roi());
		
		//
		ICICI icici=new ICICI();
		System.out.println(icici.roi());
		
		//
		HDFC hdfc=new HDFC();
		System.out.println(hdfc.roi());
		
		

	}

}

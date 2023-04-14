package day11_Interface_final_keyword;

public class PQR_childClassINT extends MNO_parent_class implements ABC_PARENT,XYZ_PARENT2
{
	//we can extend only one class and make it as a parent but multiple parents as interface can be made.
	public void m2() 
	{
		System.out.println("This is m2 from XYZ interface.");
		System.out.println(y);
		
	}


	public void m1() 
	{
		System.out.println("This is m1 from ABC interface.");
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		PQR_childClassINT obj =new PQR_childClassINT();
		obj.m1();//from parent interface
		obj.m2();//from parent interface
		
		
		obj.m3();//from parent class
		
		
		

	}

	

}

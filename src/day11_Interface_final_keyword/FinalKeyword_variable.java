package day11_Interface_final_keyword;
/*
class Test
{
	int a=1;
}
*/
class Test
{
	final int a=1;
}


public class FinalKeyword_variable 
{

	public static void main(String[] args) 
	{
		/*
		Test tobj=new Test();
		tobj.a=12;			//value updated
		System.out.println(tobj.a);		//12
		*/
		
		Test tobj=new Test();
		//tobj.a=12;			//error - we cannot change value of final variable
		System.out.println(tobj.a);		//12
		
		
		
		

	}

}

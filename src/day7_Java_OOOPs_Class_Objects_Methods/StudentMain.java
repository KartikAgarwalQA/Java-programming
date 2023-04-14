package day7_Java_OOOPs_Class_Objects_Methods;

public class StudentMain {

	public static void main(String[] args) 
	{
		StudentBase st1=new StudentBase();
		/*
		//Approach1 : Using Reference Variable
		st1.stuID=01;					
		st1.stuNAME="Test1";     
		st1.GRADE='A';
		st1.showdata();
		*/
		
		//Approach2 : using method
		st1.insertdata(102,"Test1", 'A');
		st1.showdata();
		
		
		/*
		//Approach3 : using constructor
		
		StudentBase st2=new StudentBase(03,"Test3",'C');
		{
			st2.showdata();
		}
		*/
		

	}

}

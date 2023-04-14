package day7_Java_OOOPs_Class_Objects_Methods;

public class StudentBase 
{
	int stuID;
	String stuNAME;  //Variables
	char GRADE;
	
	void showdata()
	{
		System.out.println(stuID+"	"+stuNAME+"	"+GRADE);
	}
	
	void insertdata(int ID,String Name,char Grade)
	{
		ID=stuID;
		Name=stuNAME;
		Grade=GRADE;
	}
	/*
	StudentBase (int ID,String Name,char Grade)
	{
		ID=stuID;
		Name=stuNAME;
		Grade=GRADE;
	}
	*/
}

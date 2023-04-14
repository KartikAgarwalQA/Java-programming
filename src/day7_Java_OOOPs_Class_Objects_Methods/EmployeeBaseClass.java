package day7_Java_OOOPs_Class_Objects_Methods;

public class EmployeeBaseClass 
{
	int eid;
	String emp_name;			//Variables declared
	String job_type;
	int esal;
	
	void display()
	{
		System.out.println(eid);
		System.out.println(emp_name);  //Method to display employee data
		System.out.println(job_type);
		System.out.println(esal);
	}

	void setdata(int id,String name,String jobtype,int sal) //Method to insert data
	{
		eid=id;
		emp_name=name;
		job_type=jobtype;
		esal=sal;
	}
	
	EmployeeBaseClass(int id,String name,String jobtype,int sal) //Constructor to insert data
	{
		eid=id;
		emp_name=name;
		job_type=jobtype;
		esal=sal;
	}
	
	
}

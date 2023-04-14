package day7_Java_OOOPs_Class_Objects_Methods;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		{
			/*
			//Approach 1 : Using reference variable
			EmployeeBaseClass emp1 = new EmployeeBaseClass();
			emp1.eid=101;
			emp1.emp_name="Test";
			emp1.job_type="DEX";
			emp1.esal=2000;
			
			emp1.display();
			
			EmployeeBaseClass emp2=new EmployeeBaseClass();
			emp2.eid=102;
			emp2.emp_name="Test1";
			emp2.job_type="DEX";
			emp2.esal=3000;
			emp2.display();
					
			//Approach 2 :using method to insert data
			EmployeeBaseClass emp3=new EmployeeBaseClass(); //create object emp3 in class
			emp3.setdata(103,"Test2","DEX",4000);  //insert data by using method
			
			emp3.display(); //display data
			*/
			//Approach 3 :using constructor
			EmployeeBaseClass emp4=new EmployeeBaseClass(104,"Test3","DEX",5000);
			emp4.display();
		}

	}

}

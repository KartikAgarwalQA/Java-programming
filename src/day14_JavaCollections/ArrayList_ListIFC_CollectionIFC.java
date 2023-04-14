package day14_JavaCollections;

import java.util.ArrayList;

public class ArrayList_ListIFC_CollectionIFC 

{
	class Demo
	{
		int emp1;
		String empname;
		void m1()
		{
			//code
		}
		
	}
	
	
	
	/*
	 * ArrayList - is class implemented List interface
		-----
		1) Heterogeneous data - allowed
		2) Insertion order- preserved(Index)
		3) Duplicate elements -- allowed
		4) multiple nulls -- allowed


	 */
	
	public static void main(String[] args) 
	{
	
		//declaration
		ArrayList mylist =new ArrayList();
		//List mylist=new ArrayList(); //as List is interface chck flowdiagram 
		//ArrayList <String>mylist=new ArrayList<String>(); //only strings
		
		//adding data elements into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add(true);
		mylist.add(100);
		mylist.add(null); //allowing duplicates
		mylist.add(null);
		
		//adding objects of class
		/*
		Demo dobj1=new Demo();
		Demo dobj2=new Demo();
		
		mylist.add(dobj1);
		mylist.add(dobj2);
		*/
		
		//size of arraylist
		System.out.println(mylist.size()); //7
		System.out.println(mylist); //[100, 10.5, welcome, true, 100, null, null]
		
		//remove value from arraylist
		mylist.remove(4);
		System.out.println("After removing element:"+mylist); //[100, 10.5, welcome, true, null, null]
		
		//inserting new element in the middle of list
		mylist.add(2,"java");
		System.out.println("After insertion:"+mylist);
		mylist.get(2);
		
		//read all the data from arrayList
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		
		//Clearing all the data
		mylist.clear();
		System.out.println("After clearing"+mylist);//[]
		
		
		
		
		
		
		
		
		
	}

}

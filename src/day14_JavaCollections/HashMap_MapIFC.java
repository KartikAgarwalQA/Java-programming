package day14_JavaCollections;

import java.util.HashMap;

public class HashMap_MapIFC 
{
/*
 *  HashMap - a class implemented Map interface
	--------------
	Data can be stored in the form of key, value pairs.
	Key is unique. But we can have duplicate values.
	Insertion order not preserved(Index not followed)

 * 
 */
	
	
	
	public static void main(String[] args) 
	{
		//declaration
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//adding data pairs to hashmap
		
		hm.put(101,"John");
		hm.put(102,"QA1");
		hm.put(103,"QA2"); //will add latest updated value
		hm.put(104,"QA3");
		hm.put(101,"QA4");
		
		System.out.println(hm);//{101=John, 102=John, 103=John, 104=John}
		
		System.out.println(hm.size());//4
		
		System.out.println(hm.get(102)); //here 102 is key
		
		//print only keys from hashmap
		System.out.println(hm.keySet());//[101, 102, 103, 104]
		
		//print values from hashmap
		
		for(Object key:hm.keySet())
		{
			System.out.println(key+" "+hm.get(key));
			//System.out.println(hm.get(key));
		}
		
		

	}

}

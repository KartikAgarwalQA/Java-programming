package day14_JavaCollections;

import java.util.HashSet;

public class HashSet_SetIFC_CollectionIFC 
{
	
	/*
	 * HashSet   - a class implemented Set interface
		---------
		1) Heterogeneous data ---> allowed
		2) Insertion order  --> Not preserved (Index not supported)
		3) Duplicate elements --> Not Allowed
		4) Multiple nulls Not allowed/ only single null is allowed 
	 */

	public static void main(String[] args) 
	{
		
		//declaration
		HashSet myset=new HashSet();
		//Set myset=new HashSet();
		//HashSet <Integer>myset=new HashSet<Integer>();
		
		//adding elements
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add(100);		//not following index storing randomly
		myset.add(null); //not allowing duplicates
		myset.add(null);
		
		System.out.println(myset);//[null, 100, 10.5, welcome, true]
		
		System.out.println(myset.size());//5
		//remove value from hashset
		myset.remove(10.5); //need to pass value - index not supported
		System.out.println("After removing:"+myset);//[null, 100, welcome, true]
		
		//insertion not possible in hashset
		//get specific value from hashset - not possible
		

		//read all values 
		for(Object x:myset)
		{
			System.out.println(x);
		}
		
	}

}

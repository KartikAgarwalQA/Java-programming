package day5_JavaArrays;

import java.util.Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) 
	{
		/*	1)Declare an array
		 *	2)Insert values into array.
		 *	3)Find size of an array.
		 *	4)Read Single value from an Array.
		 * 	5)Read multiple values from an Array.
		 
		
		//declaration
		//Approach 1
		
		int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		*/
		//Approach 2
		int a[]= {100,200,300,400,500};
		
		//Size or length of array
		System.out.println("No of values in array:"+ a.length);
		
		//Print single/specific value of array.
		System.out.println(a[1]);
		
		//print all values of array.
		System.out.println(Arrays.toString(a)); //100 ,200 ,300 ,400 ,500
		
		//get all values using loop
		
		/*
		for(int i=0;i<=4;i++)  // when no of rows are known
		{
			System.out.println(a[i]);
		}
			
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		*/
		//Enhanced For loop
		for(int x:a)
		{
			System.out.println(x);
		}
		
		
		
		
	}

}

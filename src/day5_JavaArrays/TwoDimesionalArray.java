package day5_JavaArrays;

public class TwoDimesionalArray {

	public static void main(String[] args) 
	{
		/*	1)Declare an array
		 *	2)Insert values into array.
		 *	3)Find size of an array.
		 *	4)Read Single value from an Array.
		 * 	5)Read multiple values from an Array.
		 
		//approach 1
		int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		System.out.println();
		*/
		//approach 2
		int a[][]={{100,200},{300,400},{500,600}};
		
		//length of array
		System.out.println(a.length);
		
		//read specific value
		System.out.println(a[0][1]);
		
		//read data from array using classic for loop
		/*for(int r=0;r<=2;r++)   // for(int r=0;r<(a.length);r++); when no of rows and col are unknown
		{
			for(int c=0;c<=1;c++) //for(int c=0;i<a[r].length;c++);
			{
				System.out.println(a[r][c]);
			}
		}
		*/
		//reading data from array using enhanced for loop
		
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.println(y);
			}
		}
		
		
		
		
		

	}

}

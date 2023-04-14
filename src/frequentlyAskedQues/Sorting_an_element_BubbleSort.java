package frequentlyAskedQues;

import java.util.Arrays;

public class Sorting_an_element_BubbleSort {

	public static void main(String[] args) 
	{
		int a[]= {1,6,2,8,5};
		
		//Before sort
		
		System.out.println("Before Sort:"+Arrays.toString(a));
		
		int n=a.length;
		
		for(int i=0;i<n;i++)  //Number of passes
		{
			for(int j=0;j<n-1;j++)  //Iteration in every pass
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];	//Swapping of two number using third variable
 					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("After sort:"+Arrays.toString(a));
		
		
		

	}

}

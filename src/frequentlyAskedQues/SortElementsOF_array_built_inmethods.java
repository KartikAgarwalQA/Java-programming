package frequentlyAskedQues;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsOF_array_built_inmethods {

	public static void main(String[] args) 
	{
		int a[]= {1,4,2,9,8};
		
		System.out.println("Elements of array a before sort:"+Arrays.toString(a));
		
		//Approach 1
		Arrays.parallelSort(a);

		System.out.println("Elements of array a after sort:"+Arrays.toString(a));
		
		int b[]= {1,9,2,4,0};
		
		System.out.println("Elements of array b before sort:"+Arrays.toString(b));
		
		//Approach 2
		Arrays.sort(b);

		System.out.println("Elements of array b after sort:"+Arrays.toString(b));
		
		//Descending order
		Integer c[]= {1,19,12,24,0};
		//Approach 2
		Arrays.sort(c,Collections.reverseOrder());

		System.out.println("Elements of array c after sort in Descending order :"+Arrays.toString(c));

	}

}

package frequentlyAskedQues;

public class Even_Odd_from_array {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7};
		
		//Extracting even numbers
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("EVEN number in array are:"+ a[i]);
			}
			
		}
		
		
		//Extracting odd numbers
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("ODD number in array are:"+ a[i]);
			}
			
		}
		
		//Enahanced for loop
		
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println("Even number is :"+value);
			}
			
		}
		
		for(int value:a)
		{
			if(value%2!=0)
			{
				System.out.println("Odd number is :"+value);
			}
			
		}
		
		
	}

}

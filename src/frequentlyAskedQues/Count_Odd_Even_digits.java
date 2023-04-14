package frequentlyAskedQues;

public class Count_Odd_Even_digits {

	public static void main(String[] args) 
	{
		int num=12345;
		
		int even_count=0;
		int odd_count=0;
		
		while(num>0)  //1234 123 12 1
		{
			int rem=num%10; //4 3 2 0
			
			if(rem%2==0)   //0 0 0
			{
				even_count++;  //1 0 1 0
			}
			
			else
			{
				odd_count++;  //0 1 0 1
			}
			
			num=num/10; //123 12 1 0
		}
		System.out.println("Number of Even Digits:"+even_count);
		System.out.println("Number of Odd Digits:"+odd_count);
	}

}

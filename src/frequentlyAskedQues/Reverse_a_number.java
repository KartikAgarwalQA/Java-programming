package frequentlyAskedQues;

import java.util.Scanner;

public class Reverse_a_number {

	public static void main(String[] args) 
	
	{
		//(  %   / =   operators   )
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		int num=sc.nextInt();  //1234
		/*
		// 1) Using algorithm
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 +num%10;   // 0*10+1234%10=4 -- 4*10+123%10=43 --43*10+12%10=432 -- 432*10+1%10=4321
			num=num/10;			  // 1234/10=123	-- 123/10=12 -- 12/10=1 -- 1/10=0
		}
		System.out.println("Reverse number is :"+rev);
		
		// 2) Using StringBuffer Class
		
		StringBuffer strb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=strb.reverse();
		System.out.println("Reverse number is :"+rev);
		*/
		// 3) Using StringBuilder Class
		
		StringBuilder stb=new StringBuilder();
		stb.append(num);
		StringBuilder rev=stb.reverse();
		System.out.println("Reverse number is :"+rev);

	}

}

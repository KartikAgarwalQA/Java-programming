package frequentlyAskedQues;

public class Reverse_a_String {

	public static void main(String[] args) 
	{
		//1) using String + concatenation operator
		
		String str="ABCDE";
		String rev="";
		
		/*
		int len=str.length(); //4
		
		for(int i=len-1;i>=0;i--) //3 2 1 0
		{
			rev=rev+str.charAt(i); //D C B A
		}
		
		System.out.println("Reversed String is :"+rev);
		*/
		
		//2) Using Character array
		char a[]=str.toCharArray();
		int len=a.length;
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reversed String is :"+rev);
		
		//3) String Buffer
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		

	}

}

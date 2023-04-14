package day6_JavaStrings;

public class EqualsVSAssignment_StringComparisons {

	public static void main(String[] args) 
	{
		
		String s1="Welcome";
		String s2="Welcome";
		
		//Case 1
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		
		//Case 2
		String s3=new String("Welcome");
		String s4=new String("Welcome");
		
		System.out.println(s3==s4); //False  -- compares the object
		System.out.println(s3.equals(s4)); //True -- compares the values of objects
		
		//Case 3
		String s5="Welcome";
		String s6=new String("Welcome");
		String s7=s6;
		
		System.out.println(s5==s6);//False
		System.out.println(s6==s7); //true
		System.out.println(s5.equals(s7)); //true
		
		

	}

}

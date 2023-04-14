package day12_AccessModifiers_wrapperclass_dataconversion;

public class DataConversionMethods {

	public static void main(String[] args) 
	{
		
	
		String s="welcome";  //String to integer not possible
		
		// String --int
		String s1="10";
		String s2="23";
		
		System.out.println(s1+s2); //1023
		
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); //33
		
		//String --Double
		String s3="124.45";
		String s4="3435.34";
		
		System.out.println(s3+s4); //124.453435
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4)); //3559.79
		
		//String --Boolean
		String s5="true";
		String s6="false";
				
		System.out.println(s5+s6); //
		System.out.println(Boolean.parseBoolean(s5) && Boolean.parseBoolean(s6)); //false
		
		/*
		 * 	int ----> String       String.valueOf(data)
			double--->String   		String.valueOf(data)
			boolean --->String    String.valueOf(data)
			char---->String       String.valueOf(data)

			String -->char  ( not possible)
		 */
		
		int a=12;
		double d=115.23;
		char C='A';
		boolean b=false;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(C));
		System.out.println(String.valueOf(b));
		
	
				

	}

}

package day12_AccessModifiers_wrapperclass_dataconversion;

public class WrapperClass {

	public static void main(String[] args) 
	{
		/*
		int a=100;
		System.out.println(a);
		*/
		
		Integer a=100;  //Wrapper class Integer
		System.out.println(a);
		
		byte b = 10;          
		short s	= 20;	
		int	i =23;
		long l=1212222222;		
		float f=23.2F;
		double d=234.3232;		
		char c='A';	
		boolean	boo =true;	
		
		//Converting primitive into objects : Autoboxing
		
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float fobj=f;
		Double dobj=d;
		Character cobj=c;
		Boolean bbj=boo;
		
		System.out.println("Byte Object:"+byteobj);
		System.out.println("Short Object:"+shortobj);
		System.out.println("Integer Object:"+intobj);
		System.out.println("Long Object:"+longobj);
		System.out.println("Float Object:"+fobj);
		System.out.println("Double Object:"+dobj);
		System.out.println("Character Object:"+cobj);
		System.out.println("Boolean Object:"+bbj);
		
		//Converting objects into primitive : Unboxing
		
		Byte bytevalue= byteobj;
		Short svalue = shortobj;
		Integer ivalue= intobj;
		Long lvalue= longobj;
		Float fvalue=fobj;
		Double dvalue=dobj;
		Character cvalue=cobj;
		Boolean bvalue= bbj;
		
		System.out.println("Byte value:"+bytevalue);
		System.out.println("Short value:"+svalue);
		System.out.println("Integer value:"+ivalue);
		System.out.println("Long value:"+lvalue);
		System.out.println("Float value:"+fvalue);
		System.out.println("Double value:"+dvalue);
		System.out.println("Character value:"+cvalue);
		System.out.println("Boolean value:"+bvalue);

	}

}

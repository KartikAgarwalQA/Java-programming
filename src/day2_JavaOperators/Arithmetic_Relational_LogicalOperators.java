package day2_JavaOperators;

public class Arithmetic_Relational_LogicalOperators {

	public static void main(String[] args) {
		
		//1) Arithmetic Operators : + , - , * , / , %
		
		int a=20,b=10;
		System.out.println("Value of a:"+(a)+"	"+"Value of b:"+(b));
		System.out.println("Addition of a and b:"+ (a+b));
		System.out.println("Subtraction of a and b:"+ (a-b));
		System.out.println("Multiplication of a and b:"+ (a*b));
		System.out.println("Division of a and b(quotient):"+ (a/b));
		System.out.println("Modular of a and b(remainder):"+ (a%b));
		
		
		// 2) Relational/Comparison Operators : > , >= , < , <= , != , ==
		// returns true or false (boolean)
		
		System.out.println(a>b); // true
		System.out.println(a>=b); //true
		System.out.println(a<b); //false
		System.out.println(a<=b); //false
		System.out.println(a!=b); // true
		System.out.println(a==b); //false
		
		//3) Logical Operators->  && , || , !(Not)
		// works btw 2 or more values
		// returns true/false
		
		boolean x=true;
		boolean y=false;
		System.out.println(x && y); //false
		System.out.println(x || y); //true
		System.out.println(!x); //false -- not x = false as x is true
		
		boolean b1=10>20; //false
		boolean b2=20>10;//true
		
		System.out.println(b1&&b2); //false
		System.out.println(b1||b2); //true
		
		
		
		
		
		
		
		
		
		
		
	}

}

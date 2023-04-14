package day9_Encapsulation_settergetter_Static_kywrd;

public class Account_Main {

	public static void main(String[] args) {
		
		Encapsulation_account enc=new Encapsulation_account();
		
		enc.setAcc_no(1234);
		enc.setName("Test");
		enc.setAmount(12346);
		
		System.out.println(enc.getAcc_no());
		System.out.println(enc.getName());
		System.out.println(enc.getAmount());
		
		

	}

}

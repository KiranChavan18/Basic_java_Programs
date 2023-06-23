package basicPrograms;

public class AccountTester {
	public static void main(String[] args) {
		Account a=new Account("SBI","SBIN0001314","Kiran",321456549,12000);
		System.out.println("Bank name: "+a.Bname );
		System.out.println("SBI IFSC: "+a.IFSC);
		System.out.println("Account Holder Name: "+a.accHolderName);
		System.out.println("Account Number: "+a.accNo);
		System.out.println("Available Balance: "+a.accBalance);
	}

}

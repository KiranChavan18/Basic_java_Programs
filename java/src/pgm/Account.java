package pgm;

public class Account extends Bank {
	String accHolderName;
	int accNo;
	double accBalance;
	
	public Account(String Bname,String IFSC,String accHolderName,int accNo,double accBalance) {
		this.Bname=Bname;
		this.IFSC=IFSC;
		this.accHolderName=accHolderName;
		this.accNo=accNo;
		this.accBalance=accBalance;
	}

}

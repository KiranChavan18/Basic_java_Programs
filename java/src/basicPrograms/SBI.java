package basicPrograms;

public class SBI implements Bank1 {
	@Override
	public void withdraw() {
		System.out.println("Withdraw");
	}
	@Override
	public void balanceEnquiry() {
		System.out.println("Balance Enquiry");
	}
	@Override
	public void deposit() {
		System.out.println("Deposit");
	}
}

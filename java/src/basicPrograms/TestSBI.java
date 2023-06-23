package basicPrograms;

public class TestSBI {
public static void main(String[] args) {
	SBI s = new SBI();
	s.withdraw();
	s.balanceEnquiry();
	s.deposit();
	System.out.println("------------------");
	
	Bank1 b = new SBI();
	b.withdraw();
	b.balanceEnquiry();
	b.deposit();
}
}

package pgm;

public class MobileTester {
	public static void main(String[] args) {
		Mobile m1=new Mobile("SAMSUNG");
		Mobile m2=new Mobile("APPLE",8);
		Mobile m3=new Mobile("REALME",12,"SILVER");
		Mobile m4=new Mobile("NOKIA",16,"BLACK",20000);
		m1.mobileDetails();
		System.out.println("-----------------------------");
		
		m2.mobileDetails();
		System.out.println("-----------------------------");
		
		m3.mobileDetails();
		System.out.println("-----------------------------");
		
		m4.mobileDetails();
		System.out.println("-----------------------------");
	}

}

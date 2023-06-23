package basicPrograms;

public class TestCab {
	public static void main(String[] args) {
		Cab c1=new Mini("BTM","Electronic City");
		Cab c2=new Prime("ITPL","PTP");
		Cab c3=new SUV ("Mejestic","Hoodi");
		System.out.println(c1.pickup);
		System.out.println(c1.drop);
		System.out.println("------------------------------");
		
		System.out.println(c2.pickup);
		System.out.println(c2.drop);
		System.out.println("------------------------------");
		
		System.out.println(c3.pickup);
		System.out.println(c3.drop);
		System.out.println("------------------------------");
	}

}

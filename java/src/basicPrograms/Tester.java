package basicPrograms;

public class Tester {
	public static void main(String[] args) {
		Bike b1=new Bike("BMW",2000);
		Bike b2=new Bike("R15",5000);
		System.out.println(b1.brand);
		System.out.println(b1.cc);
		System.out.println("-----------------------------");
		System.out.println(b2.brand);
		System.out.println(b2.cc);
	}

}

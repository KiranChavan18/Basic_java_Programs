package program4;

public class Multiplication {
	static int n=5;
	public static int print() {
		if(n==1)
			return 1;
		return n-- *print();
	}
	public static void main(String[] args) {
		System.out.println(print());
	}

}

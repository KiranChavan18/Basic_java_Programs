package logicalPrograms2;

public class ReversNo {
	static int n=5;
	public static void display(int x) {
		if(n-->1) {
			System.out.print(x+" ");
			display(x+1);
		}
		System.out.print(x+" ");
	}
public static void main(String[] args ) {
	display(1);
}
}

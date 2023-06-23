package logicalPrograms2;

public class OddNumber {
	static int n=20,m=1;
	public static void display() {
		if(n-->=1) {
			System.out.print(m+" ");
			m+=2;
			display();
		}
	}
public static void main(String[] args) {
	display();
}
}

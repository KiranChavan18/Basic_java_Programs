package program4;

public class EvenNumber {
	static int n=20,m=2;
	public static void display()
	{
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

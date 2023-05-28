package program4;

public class SumOfnNumbers {
	static int n=5;
	public static int display(int x) {
		if(x==n)
			return x;
		return x+display(x+1);
	}
public static void main(String[] args) {
	System.out.println(display(1));
}
}

package logicalPrograms;

public class LargestDigit {
	public static void main(String[] args) {
		int n=127894, max=n%10;
		n=n/10;
		while(n!=0) {
			if(n%10>max)
				max=n%10;
			n=n/10;
		}
		System.out.println(max);	
	}

}

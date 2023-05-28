package programs3;

public class TotalNoDigits {
	public static void main(String[] args) {
		int n=12345,count=0,m=n;
		while(n!=0) {
			n=n/10;
			count++;
		}
		System.out.println("Total number of Digits in "+m+" is "+count);
			
	}

}

package programs;

public class MathSeries {
	public static void main(String[] args) {
		int n=10;
		for(int i=1; i<=n; i++) {
			System.out.print((i%2==0)? i-1 +" ": + i+1 + " ");  //2 1 4 3 6 5 8 7 10 9 
		}
		
		System.out.println();
		
		for(int i=0; i<n; i++) {
			System.out.print((int)Math.pow(2, i)+ " ");  //1 2 4 8 16 32 64 128 256 512 
			
		}
		System.out.println();
		System.out.println("----------------------------");
		
		for(int i=0; i<n; i++) {
			System.out.print((1<<i)+ " ");  //1 2 4 8 16 32 64 128 256 512 
		}
		
	}

}

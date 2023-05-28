package programs;

public class EvenOrOdd {
	public static void main(String[] args) {
		int n=20;
		int lp=0;
		
		for(int i=2; i<=n*2 ; i+=4) {
			System.out.print(i + " " +(i+2)+ " ");  //2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40
			lp++;
		}
		System.out.println();
		System.out.println("Count = "+lp); //Count = 10
		
		
		for(int i=1; i<=n*2; i+=4) {
			System.out.print(i+ " "+(i+2)+ " ");  //1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 
			lp++;
		}
		System.out.println();
		System.out.println("Count = "+lp);   //Count = 20
}
}

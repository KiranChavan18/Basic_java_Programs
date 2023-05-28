package programs;

public class NumberPrinting {
	public static void main(String[] args) {
		//1 2 9 28 65...n
		int n=5;
		for(int i=0;i<=n;i++) {
			System.out.print(((i*i*i)+1 +" "));
		}
		
		System.out.println();
		
		//1 2 4 7 11.....n
		int n1=10, sum=1;
		for(int i=0; i<=n1; i++) {
			sum=sum+i;
			System.out.print(sum+" ");
		}
		System.out.println();
		
		//1 3 6 10 15....n
		
		int n2=10,sum1=0;
		for(int i=1;i<=n2;i++) {
			sum1=sum1+i;
			System.out.print(sum1+" ");
		}
		System.out.println();
		
		
		//0 1 1 2 3 5 8 13 ....n
		
		int a=0,b=1,c=0,n3=10;
		for(int i=0;i<=n3;i++) {
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
		}
		System.out.println();
		
		     //1 1 1 3 2 5 3 7 5 9 8
	//index no=0 1 2 3 4 5 6 7 8 9 10
		int x=1,y=1,z=0,n4=10;
		for(int i=0;i<n4;i++) {
			if(i%2==0) {
				z=x+y;
				System.out.print(x+" ");
				x=y;
				y=z;
			}
			else
				System.out.print(i +" ");
				
				//1 2 1 4 2 6 3 8 5 10 
				//System.out.print(i+1 +" ");
		}
		
	}

}

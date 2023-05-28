package programs3;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc=null;
		try {
		 Scanner sc1= new Scanner(System.in);
		 
		 System.out.println("Enter no of elements");
		 int size = sc1.nextInt();
		 
		 int arr[]= new int[size];
		 
		 System.out.println("Enter Array Elements");
		 for(int i=0; i<size; i++) {
			 arr[i]=sc1.nextInt();
		 }
		 
		 //for each loop
		 for(int i:arr)
			 System.out.println(i+" ");
	}
		finally {
			if(sc !=null) {
				sc.close();
			}
		}
	}
}

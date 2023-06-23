package arraysPrograms;
import java.util.Scanner;

public class EvenElements {
	public static void main(String[] args) {
		int arr[]=new int[] {11,2,30,44,55,60};
		
		for(int i=0;i<arr.length; i++) {
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		//System.out.print((arr[i]%2==0)?arr[i]+" ":" ");
		}
		
		//for(int i:arr)
			//if(i%2==0)
				//System.out.print(i+" ");
			//System.out.print((i%2==0)?i+" ":" ");
	}

}

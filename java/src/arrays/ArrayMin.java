package arrays;

public class ArrayMin {
	public static void main(String[] args) {
		int arr[]= {22,44,55,99,66,77};
		
		int min=arr[0]; //Consider arr[0] as min
		
		for(int i=1; i<arr.length; i++)
			if(arr[i]>min)
				min=arr[i];
		
		System.out.print(min);
	}

}

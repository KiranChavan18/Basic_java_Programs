package arrays;

public class ArrayMax {
	public static void main(String[] args) {
		int arr[]= {20,50,77,99,100,200};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
			if(arr[i]>max)
				max=arr[i];
		
		System.out.print(max);
	}

}

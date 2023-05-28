package arrays;

public class SwappingArray {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		int size=arr.length;
		
		for(int i=0;i<size/2;i++) {
			/*
			int temp=arr[i];
			arr[i]=arr[size-i-1];
			arr[size-i-1]=temp; */
			
			 arr[size-i-1]=arr[i]+arr[size-i-1]-(arr[i]=arr[size-i-1]);
		}
		
		for(int i:arr)
			System.out.print(i+" ");
			
	}

}

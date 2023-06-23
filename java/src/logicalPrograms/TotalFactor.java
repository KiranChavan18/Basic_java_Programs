package logicalPrograms;

public class TotalFactor {
	public static void main(String[] args) {
		int n=20,count=0;
		for(int i=1;i<=n;i++)
			if(n%i==0)
				count++;
		System.out.println("Total factor of "+n+" is "+count);
	}

}

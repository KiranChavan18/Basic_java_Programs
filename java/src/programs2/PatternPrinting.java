package programs2;

public class PatternPrinting {
public static void main(String[] args) {
	int n=5;
	for(int i=0;i<n;i++) 
		System.out.print((char)(i+65)+" ");
		System.out.println();
		
		for(int i=0;i<n;i++)
			System.out.print(i+" ");
			System.out.println();
	
		for(int i=0;i<n;i++)
			System.out.print("* ");
			System.out.println("");
			System.out.println("---------");
			
			
			
			int row=5,col=5;
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++)
					System.out.print("* ");
				System.out.println();
			}
			System.out.println("");
			System.out.println("---------");
			int n1=5;
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) 
					if(i+j==(n1-1) || i==n1-1||i==0)
						System.out.print("* ");
						
					else
						System.out.print("  ");
						System.out.println();
			}
			System.out.println("");
			System.out.println("---------");
			
			
	
}
}	/*A B C D E 
	  0 1 2 3 4 
	  * * * * *  
	   		* * * * * 
	   		* * * * * 
	   		* * * * * 
	   		* * * * * 
	   		* * * * * 
	  
	   		* * * * * 
	   		*       * 
	   		*       * 
	   		*       * 
	   		* * * * * 

	   
	  
	   
	  */

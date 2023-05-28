package string;

public class TotalNoChar {
	public static void main(String[] args) {
		String s = "Bangaluru"; 
		int count=0;
		System.out.println(s.length());  //built-in method
		char ch[]= s.toCharArray();
		
		for(char i:ch)
			count++;
		System.out.println(count);
		
		
	}

}

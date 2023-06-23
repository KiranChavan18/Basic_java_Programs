package stringPrograms;

public class ConvertString {
	public static String convertString(String word) {
		String s = "BAngaloreciTy";
		char ch[] =s.toCharArray();
		
		for (int i=0; i<ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z')
					ch[i]=(char) (ch[i]+32);
			else if(ch[i]>='a' && ch[i]<='z')
				ch[i]=(char) (ch[i]-32);
			}
	
		return String.valueOf(ch);
	}
}

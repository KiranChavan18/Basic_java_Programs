package programs3;

public class PowerNo {
	public static void main(String[] args) {
		int base=2,pow=3,op=1;
		while(pow-->=1)
			op*=base;
		System.out.println(op);
	}

}

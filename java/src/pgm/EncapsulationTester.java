package pgm;

public class EncapsulationTester {
public static void main(String[] args) {
	Encapsulation e=new Encapsulation("KD","BD");
	System.out.println(e.boy);
	System.out.println(e.getGf());
	e.setGf("baby");
	System.out.println(e.getGf());
	
}
}

package pgm;

public class Laptop {
	String brand;
	int ram;
	
	public void properties() {
		System.out.println(brand);
		System.out.println(ram);
		}

	public static void main(String[] args) {
		Laptop l1= new Laptop();
		l1.brand="Lenovo";
		l1.ram= 4;
		
		Laptop l2= new Laptop();
		l2.brand="HP";
		l2.ram=8;
		
		l1.properties();
		l2.properties();
		
		}

}

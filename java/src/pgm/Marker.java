package pgm;

public class Marker {
	String name;
	int size;
	double price;
	
	public Marker(String name,int size, double price) {
		this.name=name;
		this.size=size;
		this.price=price;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(size);
		System.out.println(price);
	}
	
	public static void main(String[] args) {
		Marker m1= new Marker("red",10,10.0);
		m1.print();
		
	}
	

}

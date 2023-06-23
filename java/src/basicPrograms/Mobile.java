package basicPrograms;

public class Mobile {
	String brand;
	int ram;
	String colour;
	double price;
	
	public Mobile(String brand) {
		this.brand=brand;
	}
	public Mobile(String brand,int ram) {
		this(brand);
		this.ram=ram;
	}
	public Mobile(String brand,int ram,String colour) {
		this(brand,ram);
		this.colour=colour;
	}
	public Mobile(String brand,int ram,String colour,double price) {
		this(brand,ram,colour);
		this.price=price;
	}
	public void mobileDetails() {
		System.out.println(brand);
		System.out.println(ram);
		System.out.println(colour);
		System.out.println(price);
	}
}

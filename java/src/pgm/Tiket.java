package pgm;

public class Tiket {
	int tiketNo;
	String movieName;
	double price;
	
	public Tiket(int tiketNo,String movieName,double price) {
		this.tiketNo=tiketNo;
		this.movieName=movieName;
		this.price=price;
	}
	
	public void tiketDetails() {
		System.out.println("Movie Name is "+ movieName );
		System.out.println("Ticket No is " +tiketNo);
		System.out.println("Ticket price is "+price);
	}
	public static void main(String[] args) {
		Tiket t1=new Tiket(100,"KGF",500);
		t1.tiketDetails();
		
		System.out.println("--------------------");
		Tiket t2=new Tiket(101,"KGF2",500);
		t2.tiketDetails();
	}
	
}

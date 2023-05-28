package pgm;

public class Encapsulation {
	String boy;
	private String gf;
	
	public Encapsulation(String boy,String gf) {
		this.boy=boy;
		this.gf=gf;
	}
	public String getGf() {
		return gf;
	}
	public void setGf(String gf) {
		this.gf=gf;
	}
}

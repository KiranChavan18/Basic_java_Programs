package basicPrograms;

public class Bookk {
	String title;
	int pages;
	
	Bookk(String title,int pages){
		this.title=title;
		this.pages=pages;
	}
	
	@Override
	public String toString() {
		return title;
	}
	
	@Override
	public boolean equals(Object o) {
		Bookk b =(Bookk) o;
		if(this.title==b.title&&this.pages==b.pages)
		return true;
		else
			return false;
		
	}
}

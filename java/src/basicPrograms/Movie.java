package basicPrograms;

public class Movie {
	String movieName;
	String hero;
	String director;
	
	public Movie(String movieName) {
		this.movieName=movieName;
	}
	public Movie(String movieName,String hero) {
		this.movieName=movieName;
		this.hero=hero;
	}
	public Movie(String movieName,String hero,String director) {
		this.movieName=movieName;
		this.hero=hero;
		this.director=director;
	}
	public void details() {
		System.out.println("Movie Name is "+movieName);
		System.out.println(hero);
		System.out.println(director);
	}
	
}

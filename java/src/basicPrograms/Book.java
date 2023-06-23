package basicPrograms;

public class Book {
	String author;
	String title;
	int pages;
	
	public Book(String author,String title,int pages) {
		this.author = author;
		this.title=title;
		this.pages=pages;
	}
	
	public void bookDetails() {
		System.out.println(author);
		System.out.println(title);
		System.out.println(pages);
	}

	public static void main(String[] args) {
		Book b1=new Book("Kiran","KD",20);
		b1.bookDetails();
		
		Book b2=new Book("Ram","JD",30);
		b2.bookDetails();
		
		
	}

}

package oops;

public class Book {
	int BookId;
	String title;
	String author;
	int price;
	public Book() {
		BookId= 101;
		title= "Java Programming";
		author= "James Gosling";
		price= 650;

	}
	public void display() {
		System.out.println("Book ID: "+ BookId);
		System.out.println("Title: "+ title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book();
		b1.display();
	}

}

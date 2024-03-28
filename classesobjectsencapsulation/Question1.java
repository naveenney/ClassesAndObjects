package classesobjectsencapsulation;

class Book {
	private static String publication = "Penguin Random House Publishing";
	private String title;

	private String isbn;

	private String author;

	private int publicationYear;

	public Book(String title, String isbn, String author, int publicationYear) {
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.publicationYear = publicationYear;

	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublitionYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAuthor() {
		return author;
	}

	public int publicationYear() {
		return publicationYear;
	}

	public static String getPublication() {
		return publication;
	}

	public void display() {
		System.out.println("BookName:" + title + "\n\nISBN:" + isbn + "\n\nAuthor:" + author + "\n\nBook Publication:"
				+ publication + "\n\nPublication Year:" + publicationYear);
	}

}

public class Question1 {

	public static void main(String[] args) {

		Book book = new Book("Bad Therapy(why The  Kids Aren't growing up", "978-3-16-148410-0", "Abigail Shrier",
				2024);

		book.display();

	}
}
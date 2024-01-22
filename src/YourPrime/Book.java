package YourPrime;

public class Book extends Media {

	// book sub-class inherit from Media (superclass)
	// TODO complete all methods in this class, refer each method for details
	
	private String author;
	private int noPages;
	
	public Book(String title, String author, int year, int rating, int noPages, Genre genre) {
		// TODO assign all arguments to class
	}
	
	public int getNoPages() {
		// TODO return number of pages
	}
	
	@Override
	public String toString() {
		// TODO return a string with the message
		// title-of-book by name-of-author price at price
	}
}

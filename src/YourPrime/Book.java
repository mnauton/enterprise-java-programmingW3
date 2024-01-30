package YourPrime;

public class Book extends Media {

	// book sub-class inherit from Media (superclass)
	// TODO complete all methods in this class, refer each method for details
	
	private String author;
	private int noPages;

	public Book(String title, String author, int year, int rating, int noPages, Genre genre) {
		// TODO assign all arguments to class
		this.title = title;
		this.author = author;
		this.year = year;
		this.rating = rating;
		this.noPages = noPages;
		this.genre = genre;
	}

	//  double getPrice() - call the Genre.setPrice(int rating), use rating as argument
	public double getPrice() {
		return genre.setPrice(rating);
	}

	public int getNoPages() {
		// TODO return number of pages
		return this.noPages;
	}

	@Override
	// TODO return a string with the message
	// title-of-book by name-of-author price at price
	public String toString() {
		return this.title + " by " + author + " price at = " + price + " €";
	}
}

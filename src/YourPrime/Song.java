package YourPrime;

public class Song extends Media {
	
	// TODO complete this class
	// variable(s):
	//  title (String), artist (String), rating (int), genre (Genre)
	private String title;
	private String artist;
	private int rating;
	private Genre genre;

	// method(s):
	//  constructor(String, String, int, Genre) - assign to the this.variable(s)
	public Song(String title, String artist, int rating, Genre genre) {
		this.title = title;
		this.artist = artist;
		this.rating = rating;
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	//  double getPrice() - call the Genre.setPrice(int rating), use rating as argument
	public double getPrice() {
		return genre.setPrice(rating);
	}

	//  override toString() method to display song information
	@Override
	public String toString() {
		return title + " by " + artist + " price at = " + this.price + "}\n";
	}
}

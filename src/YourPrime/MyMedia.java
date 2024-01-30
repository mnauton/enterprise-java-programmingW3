package YourPrime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyMedia {
	
	// TODO complete the MyMedia class - use the UML diagram in the task document to guide you
	private List<Movie> movieList;
	private List<Book> bookList;
	private List<Song> songList;


	// TODO use argument to assign instance variables in the class
	public MyMedia(List<Movie> movieList, List<Book> bookList, List<Song> songList) {
		this.movieList = movieList;
		this.bookList = bookList;
		this.songList = songList;
	}

	// TODO calculate the fees for all media - use the getPrice method from the media sub-types
	public double calculateFees() {
		double total = 0;
		for (Movie mov : movieList) {
			total += mov.getPrice();
		}
		for (Book bk : bookList) {
			total += bk.getPrice();
		}
		for (Song s : songList) {
			total += s.getPrice();
		}
		return total;
	}

	@Override
	// TODO return a string, call the toString method from the media sub-types
	public String toString() {
		String str = "";
		for (Movie mov : movieList) {
			str += mov.toString();
		}
		for (Book bk : bookList) {
			str += bk.toString();
		}
		for (Song s : songList) {
			str += s.toString();
		}
		return str;
	}


	public List<? extends Media> sort(String orderType) {
		// TODO the sort method will generate a sorted list (ascending order) following the orderType argument
		// this method will be used by the subscriber objects
		// return the sorted list

		// Declare ArrayList to consolidate types that are common to all media
		List<Media> master = new ArrayList<>();
		master.addAll(bookList);
		master.addAll(songList);
		master.addAll(movieList);

		Comparator<Media> compareByPrice = Comparator.comparing(Media::getPrice);
		Comparator<Media> compareByRating = Comparator.comparing(Media::getRating);
		Comparator<Media> compareByTitle = Comparator.comparing(Media::getTitle);
		Comparator<Book> compareByNoPage = Comparator.comparing(Book::getNoPages);
		Comparator<Movie> compareByDuration = Comparator.comparing(Movie::getDuration);
		Comparator<Song> compareByArtist = Comparator.comparing(Song::getArtist);

		if (orderType.equalsIgnoreCase("Price")) {
			master.sort(compareByPrice);
		} else if (orderType.equalsIgnoreCase("Pages")) {
			bookList.sort(compareByNoPage);
			return bookList;
		} else if (orderType.equalsIgnoreCase("Duration")) {
			movieList.sort(compareByDuration);
			return movieList;
		} else if (orderType.equalsIgnoreCase("Rating")) {
			master.sort(compareByRating);
		} else if (orderType.equalsIgnoreCase("Title")) {
			master.sort(compareByTitle);
		} else if (orderType.equalsIgnoreCase("Artist")) {
			songList.sort(compareByArtist);
			return songList;
		}
		return master;
	}
}

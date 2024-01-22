package YourPrime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyMedia {
	
	// TODO complete the MyMedia class - use the UML diagram in the task document to guide you
	
	public MyMedia(List<Movie> listM, List<Book> listB, List<Song> listS) {
		// TODO use argument to assign instance variables in the class
	}
	
	public double calculateFees() {
		// TODO calculate the fees for all media - use the getPrice method from the media sub-types
	}
	
	@Override
	public String toString() {
		// TODO return a string, call the toString method from the media sub-types
	}
	
	public List<?> sort(String orderType) {
		// TODO the sort method will generate a sorted list (ascending order) following the orderType argument
		// this method will be used by the subsciber objects
		// return the sorted list
	}
}

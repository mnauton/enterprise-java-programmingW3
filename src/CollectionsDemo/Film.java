package CollectionsDemo;

import java.util.Comparator;

public class Film implements Comparator<Film>, Comparable<Film> {
	String title;
	
	public Film(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	@Override
	public int compare(Film o1, Film o2) {
		return (int) o1.title.compareTo(o2.title);
	}

	@Override
	public int compareTo(Film o) {
		return this.title.compareTo(o.title);
	}
}

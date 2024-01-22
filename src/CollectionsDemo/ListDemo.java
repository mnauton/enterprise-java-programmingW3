package CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		// create list instance
		List<Film> listA = new ArrayList<>();
		List<Film> listB = new LinkedList<>();
		// List<Film> listC = new Vector<>();
		// List<Film> listD = new Stack<>();
		
		// insert element in list
		Film f1 = new Film("Everything, Anything, All at once");
		Film f2 = new Film("John Wick");
		Film f3 = new Film("The Parasite");
		
		listA.add(f1);
		listA.add(f2);
		listA.add(f3);
		
		// insert element at specific index
		listB.addAll(listA); // this is insert all elements from another list
		listB.add(3, new Film("Avengers EndGame"));

		// get element from list
		Film fObject = listA.get(0);
		System.out.println(fObject.title);
		
		// check if list contains element
		Film f4 = listB.get(3);
		System.out.println(listA.contains(f4));
		
		// find element with indexof and lastindexof
		String [] str = {"a", "b", "c", "a", "d", "e", "a", "f"};
		List<String> list = (List<String>) Arrays.asList(str); // convert your array to List
		System.out.println(list.indexOf("a"));
		System.out.println(list.lastIndexOf("a"));
		
		// remove element using object and index
		listB.remove(f4);
		System.out.println(listB.size());
		
		listB.add(f4);
		listB.remove(3);
		System.out.println(listB.size());
		
		// remove everything
		listB.clear();
		System.out.println(listB.size());
		
		// retain element (similar to previous example)
		listB.addAll(listA);
		listB.add(f4);
		listB.retainAll(listA);
		System.out.println(listB.size());
		
		// sublist of list
		List<Film> listS = listB.subList(0, 2);
		System.out.println(listS.size());
		
		// sorting list with comparable and comparator
		Collections.sort(list);
		System.out.println(list.toString());
		
		listB.add(f4);
		Comparator<Film> compareByTitle = Comparator.comparing(Film::getTitle);
		listB.sort(compareByTitle);
		
		for(Film f : listB) 
			System.out.println(f.title);
	}

}

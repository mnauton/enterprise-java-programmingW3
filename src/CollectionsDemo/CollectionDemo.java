package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		
		// Create a collection
		Collection<String> collection = new ArrayList<>();
		
		// Add element to collection
		String anElement = "This is an element";
		boolean didCollectionChange = collection.add(anElement);
		if (didCollectionChange)
			System.out.println("Element added");
		
		// Remove element from collection
		boolean wasElementRemoved = collection.remove(anElement);
		if (wasElementRemoved)
			System.out.println("Element removed");
		
		// Add collection of objects to collection
		Film f1 = new Film("Everything, Anything, All at once");
		Film f2 = new Film("John Wick");
		Film f3 = new Film("The Parasite");
		
		Collection<Film> hashF = new HashSet<>();
		hashF.add(f1);
		hashF.add(f2);
		hashF.add(f3);
		
		Collection<Film> filmCollection = new HashSet<>();
		filmCollection.addAll(hashF);
		System.out.println(filmCollection.isEmpty());
		
		// Remove collection of elements from collection
		filmCollection.removeAll(hashF);
		System.out.println(filmCollection.isEmpty());
		
		// Retain all elements from a collection in another collection
		Collection<String> capitalStr = new ArrayList<>();
		capitalStr.add("A");
		capitalStr.add("B");
		capitalStr.add("C");
		
		Collection<String> lowerStr = new ArrayList<>();
		lowerStr.add("a");
		lowerStr.add("b");
		lowerStr.add("c");
		
		Collection<String> target = new HashSet<>();
		target.addAll(capitalStr);
		target.addAll(lowerStr);
		System.out.println("Before :" + target.toString());
		
		target.retainAll(lowerStr);
		System.out.println("After  :" + target.toString());
		
		// Check if a collection contains a certain element
		System.out.println("Does 'The Parasite' exists ? " + hashF.contains(f3));
		System.out.println("How about the film collection ? " + filmCollection.containsAll(hashF));
		
		// Check the collection size
		System.out.println("No of String = " + target.size());
		
		// Iterate a collection
		// 1 - Use Java iterator
		
		Iterator<Film> iterator = hashF.iterator();
		while (iterator.hasNext()) {
			Film f = iterator.next();
			System.out.println(f.title);
		}
		
		// 2 - Use for-each
		for (Film f : hashF) {
			System.out.println(f.title);
		}
	}
}

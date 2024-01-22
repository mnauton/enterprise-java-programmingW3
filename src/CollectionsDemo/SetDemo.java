package CollectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		// create a set
		Set<Film> setA = new HashSet<>();
		Set<Film> setB = new LinkedHashSet<>();
		Set<Film> setC = new TreeSet<>();
		
		// create immutable set instances
		Set<String> setD = Set.<String>of();
		Set<String> setE = Set.<String>of("a", "b", "c");
		
		// add element to set
		Film f1 = new Film("Everything, Anything, All at once");
		Film f2 = new Film("John Wick");
		Film f3 = new Film("The Parasite");
		
		setA.add(f1);
		setA.add(f2);
		setA.add(f3);
		
		// iterate your set
		Iterator<Film> iterator = setA.iterator();
		while(iterator.hasNext()) 
			System.out.println(iterator.next().title);
		
		// check order according to linkedhashset
		setB.add(f1);
		setB.add(f2);
		setB.add(f3);
		
		for(Film f : setB) {
			System.out.println(f.title);
		}
		
		// check order according to treeset
		setC.add(f1);
		setC.add(f2);
		setC.add(f3);
		for(Film f : setC) {
			System.out.println(f.title);
		}
		
		// remove element from set
		setA.remove(f2);
		System.out.println(setA.size());
		
		// remove all element from set
		setB.removeAll(setA);
		System.out.println(setB.size());
		
		// retain all element present
		setB.add(f1);
		setB.add(f2);
		setB.add(f3);
		setB.retainAll(setA);
		System.out.println(setB.size());
		
		// check if set is empty
		System.out.println(setC.isEmpty());
		System.out.println(setD.isEmpty());
		
		// check is set contains element
		System.out.println(setE.contains("z"));
		
		// convert set to list
		List<Film> list = new ArrayList<>();
		list.addAll(setB);
		for(Film f : list) {
			System.out.println(f.title);
		}
	}

}

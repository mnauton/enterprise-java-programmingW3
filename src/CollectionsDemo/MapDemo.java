package CollectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		// create map instance
		Map<String, Film> mapA = new HashMap<>();
		Map<String, Film> mapB = new TreeMap<>();
		
		// inserting element into map
		Film f1 = new Film("Everything, Anything, All at once");
		Film f2 = new Film("John Wick");
		Film f3 = new Film("The Parasite");

		mapA.put("key1", f1);
		mapA.put("key2", f2);
		mapA.put("key3", f3);
		
		// insert all element
		mapB.putAll(mapA);
		System.out.println(mapB.size());
		
		// get element from map
		Film f = mapB.get("key1");
		System.out.println(f.title);
		
		// get or default value when there is no value
		f = mapB.getOrDefault("key X", new Film("The Matrix"));
		System.out.println(f.title);
		
		// check if map contains key or value
		System.out.println(mapA.containsKey("key1"));
		System.out.println(mapA.containsValue(f1));
		
		// iterating our map using key or value
		Iterator<String> iterator = mapA.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Film value = mapA.get(key);
			System.out.println(value.title);
		}
		
		for(String key : mapA.keySet()) 
			System.out.println(mapA.get(key).title);
		
		Iterator<Film> iteratorV = mapB.values().iterator();
		while(iteratorV.hasNext())
			System.out.println(iteratorV.next().title);
		
		// replace an entry in map
		f = new Film("Avengers End Game");
		mapA.replace("key1", f);
		System.out.println(mapA.get("key1").title);
	}

}

package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 100);
		
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		
		h.put(3, "Tom");
		
		System.out.println(h.get(3));
		
		// to restrict
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(4, 400);
		
		// h1.put(5, "Tim"); // we can not put integer and string
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>(); // we can give any combination
		h2.put(5, "Cook");
		
	}

}

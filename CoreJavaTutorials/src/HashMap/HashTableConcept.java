package HashMap;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		// it is similiar to HashMap but it is synchronised
		// stores the value on basis of key-value
		// key --> object ---> Hashcode ---> value
		
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tim");
		h1.put(2, "Testing");
		h1.put(3, "Java");
		
		// create a clone copy/shallow copy:
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable)h1.clone();
		
		System.out.println("The values from h1: " + h1);
		System.out.println("The values from h2: " + h2);
		
		// to clear h1
		h1.clear();
		
		// you can see h1 value is clear but h2 is still there
		System.out.println("The values from h1: " + h1);
		System.out.println("The values from h2: " + h2);
		
		// contains value:
		Hashtable ht = new Hashtable();
		ht.put("A", "Manish");
		ht.put("B", "Automation QA");
		ht.put("C", "Selenium");
		
		if(ht.containsValue("Manish"))
			System.out.println("Value is found");
		
		// print all the values from hashtable using Enumeration --- element()
		
		Enumeration e = ht.elements();
		System.out.println("Print value from ht using Enumeration");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		// get all values from hashtable ---> entrySet() --- set of hashtable values:
		System.out.println("Print value from ht using entry Set");
		Set s = ht.entrySet();
		System.out.println(s);
		
		System.out.println("check both the hashtable are equal or not:");
		Hashtable ht1 = new Hashtable();
		ht1.put("A", "Manish");
		ht1.put("B", "Automation QA");
		ht1.put("C", "Selenium");
		ht1.put("C", "Selenium"); // it contains only unique value so it will not print duplicate value
		// no null key and null values // it will throw null pointer exception
		
		// check both the hashtable are equal or not:
		if(ht.equals(ht1))
			System.out.println("Both are equal");
		
		// get the value from a key
		System.out.println(ht1.get("A"));
		
		// get the hashcode of hashtable object
		System.out.println("The hash code value of ht1 : " + ht1.hashCode());
		
		// generic
		Hashtable<String, String> ht3 = new Hashtable<String, String>(); // it will allow only string key and string value
		ht3.put("D", "ABC");

	}

}

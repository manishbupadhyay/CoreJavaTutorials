package JavaCollectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add:
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("TestNG");
		
		//print
		System.out.println("Content of linkedlist:" + ll);
		
		//addFirst:
		ll.addFirst("Manish");
		
		
		//addLast
		ll.addLast("Automation");
		
		//print
		System.out.println("Content of linkedlist:" + ll);
		
		//get:
		System.out.println(ll.get(0));
		
		//set:
		ll.set(0, "Mark");
		System.out.println(ll.get(0));
		
		// remove first and last element
		ll.removeFirst();
		ll.removeLast();
		
		//print
		System.out.println("Content of linkedlist:" + ll);
		
		// remove from specific position
		ll.remove(2);
		System.out.println("Content of linkedlist:" + ll);
		
		// how to print all the value of linkedlist
		
		// for loop
		System.out.println("using for loop");
		
		for(int n=0;n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		
		// advance for loop
		System.out.println("using advance for loop");
		for(String str : ll) {
			System.out.println(str);
		}
		
		//iterator
		System.out.println("using iterator");
		Iterator<String> it   = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//while loop
		System.out.println("using while loop");
		int num = 0;
		while(ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}
				
				
	}

}

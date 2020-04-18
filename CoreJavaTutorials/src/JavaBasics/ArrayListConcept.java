package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100); // 0 index
		ar.add(200); // 1
		ar.add(300); // 2
		
		System.out.println(ar.size());
		
		ar.add(400); // 3
		ar.add(500); // 4
		
		System.out.println(ar.size());
		
		ar.add("Tom"); // 5
		ar.add("Mello"); // 6
		ar.add(12.33); // 7
		ar.add('M'); // 8
		ar.add(true); // 9
		
		System.out.println(ar.size());
		
		// to remove index 9
		ar.remove(9);
		System.out.println(ar.size());
		
		// to check value at index 8 
		System.out.println(ar.get(8));
		
		// System.out.println(ar.get(10)); // IndexOutOfBoundsException:
		
		// to print all the value of arrayList we use for loop
		
		for(int i=0;i<ar.size();i++) {
			
			System.out.println(ar.get(i));
		}
		
		// to restrict only integer value in arrayList
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(7);
		// ar1.add("Sunny"); // we can not add string
		
		ArrayList <String> ar2 = new ArrayList<String>();
		ar2.add("Jhon");
		//ar2.add(10); // we can not add integer value
		
		
	}

}

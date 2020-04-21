package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		int a[] = new int[3]; // Static array -- size is fixed
		
		// Dynamic Array -- ArrayList
		// 1. can contain duplicate value/elements
		// 2. maintains inserting order
		//3. synchronised
		//4. allow random access to fetch the element because it stores the value on the basis of indexes
		//5. can add any type of value
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		ar.add(50); // we can add duplicate value in ArrayList
		ar.add("A");
		ar.add(true);
		ar.add('M');
		
		System.out.println(ar.size()); // size of ArrayList
		
		System.out.println(ar.get(2)); // to get the value from an index
		
		System.out.println("***********");
		// to print all the value from ArrayList
		//1- for loop
		//2- using iterator
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		// non generic vs generic
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); // this is called generic
		
		ar1.add(60);
		System.out.println(ar1.get(0));
		
		//ar1.add("Selenium"); // we can not add String
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Hello");
		ar2.add("Selenium");
		//ar2.add(1); // we can not add integer
		
		ArrayList<E> ar3 = new ArrayList<E>(); // if we don't know what types of parameter is comming around then simple mention <E>
		
		// Employee class object
		Employee e1 = new Employee("Manish", 29, "QA");
		Employee e2 = new Employee("Tom", 23, "Dev");
		Employee e3 = new Employee("Peter", 30, "Build");
		
		// create ArrayList
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		// iterator to traverse the value
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
		Employee emp = it.next();
		
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
		}
		
		System.out.println("***** addAll *****");
		
		// addAll()
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("Selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("java");
		ar6.add("javaScript");
		
		// if you want to add all list of ar6 into ar5 then we need to use addAll() method
		ar5.addAll(ar6);
		
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("***** removeAll *****");
		
		// removeAll()
		ar5.removeAll(ar6);
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("***** retainAll *****");
		
		//retainAll() -- is used to retain only common value from ArrayList
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("Selenium");
		ar7.add("QTP");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("test");
		ar8.add("java");
		ar8.add("javaScript");
		
		ar7.retainAll(ar8);
		
		for(int i=0; i<ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}
	}

}

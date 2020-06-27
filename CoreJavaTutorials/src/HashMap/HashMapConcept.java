package HashMap;
import JavaCollectionsFramework.*;
import java.util.HashMap;import java.util.Map.Entry;
public class HashMapConcept {

	public static void main(String[] args) {
		// HashMap is a class and it implements Map interface
		// extends AbstractMap
		// It contains only unique elements
		// stores the value in - key - value pair
		// it may have one null key and multiple null values
		// it maintains no order ---- not thread safe
		// HashMap is non-synchronized
		// concurrent modification exception -- Fail - fast condition
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "TestNG");
		hm.put(3, "Jenkins");
		hm.put(4, "Maven");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4)); // it will not throw any exception because we are not storing in index.
		// it will return null.
		
		// to print all value
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		// to remove value from map
		System.out.println(hm); // output : {1=Selenium, 2=TestNG, 3=Jenkins, 4=Maven}
		hm.remove(3); 
		System.out.println(hm); // output : {1=Selenium, 2=TestNG, 4=Maven}
		
		//calling empoyee method from JavaCollectionsFramework package
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		Employee e1 = new Employee("Manish",29,"QA");
		Employee e2 = new Employee("Andy",28,"Dev");
		Employee e3 = new Employee("Pinku", 29, "DevOps");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		// traverse the hashMap
		for(Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee" + key + " Info: ");
			
			System.out.println(e.name + " " + e.age + " " + e.dept);
		}
	}

}

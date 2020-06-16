package Encapsulation;

public class EncapsulationExample {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Aadi");
		
		// it will return null becuase in person class name is set to Manish and here Aadi se set which is not matching
		System.out.println(person.getName());
	}
	
}

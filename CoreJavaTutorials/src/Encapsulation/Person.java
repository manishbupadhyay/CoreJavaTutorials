package Encapsulation;

public class Person {

	private String name;
	private String gender;
	private Integer age;
	private String occupation;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		// here we have set name="Manish"
		if(name.equalsIgnoreCase("Manish")) {
			this.name = name;	
		}
		
	}
}

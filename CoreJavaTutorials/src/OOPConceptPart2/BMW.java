package OOPConceptPart2;

public class BMW extends Car {// "Has a relationship"
	
	// Method Overriding : when same method is present in parent class as well as in child class with the same name and same number of arguments.
	// is called Method Overriding
	public void start() { // overridden method
		System.out.println("BMW---start");
	}
	
	public void theftSafety() {
		System.out.println("BMW---theftSafety");
	}
	
	
}

package OOPConceptPart1;

public class LocalVsGlobalVariables {

	// Global variable -- class variable
	String name = "Tom";
	int age = 25;
	
	public static void main(String[] args) {
		
		int i = 10; // local variable of main method
		System.out.println(i);
		
		// to access name and age we need to create object of class LocalVsGlobalVariables
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj.sum();

	}
	
	public void sum() {
		int i = 10; // local variable of sum method
		int j = 20;
		
		System.out.println("******************************");
		System.out.println(name);
		System.out.println(age);
	}

}

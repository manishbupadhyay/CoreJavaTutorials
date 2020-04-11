package OOPConceptPart1;

public class StaticAndNonStaticConcept {

	// globale vars: the scope of global vars will be available across all the function with some conditions.
	
	String name = "Tom"; // non static global variable
	static int age = 25; // static global variable
	
	public static void main(String[] args) {
	
		// how to call static method and variable?
		// there are 2 way
		// 1. - direct calling
		sum();
		// 2. - calling by class name
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		// how to call non static method and variable ?
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		// can i access static method and variable with object reference ?
		// yes we can access but it's not a good pratice
		
		obj.sum(); // warning will be given
		System.out.println(obj.age);

	}
	
	public void sendMail() { // non-static method
		System.out.println("send mail");
	}
	
	public static void sum() { // static method
		System.out.println("sum method");
	}

}

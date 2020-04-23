package OOPConceptPart2;

public class FinallyConcept {

	public static void main(String[] args) {
		
		//test1();
		//test2();
		division();
	}
	
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("inside catch block");
		}
		
		finally {
			System.out.println("inside finally block");
		}
	}
	
	
	public static void test2() {
		try {
			System.out.println("inside test2 method");
		}
		finally {
			System.out.println("finally code in test2 method");
		}
	}
	
	public static void division() {
		int i =10;
		try {
			System.out.println("inside try block");
			int k = i/0; // here we know it will throw ArithmeticException but in catch if we will
			//mention NullPointerException instead of ArithmeticException then it will not go 
			//inside catch block. After try block it directly go in finally block and then throw ArithmeticException
		}catch(NullPointerException e) { //catch(ArithmeticException e) {
			System.out.println("inside catch block");
			System.out.println("divide by zero error");
		}
		
		finally {// finally block will be always called
			System.out.println("execute this code even after any exception");
		}
	}

}

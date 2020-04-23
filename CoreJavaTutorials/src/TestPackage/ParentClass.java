package TestPackage;

public class ParentClass {
// to prevent/remove inheritance
// to prevent method overriding	
	
	public final void start() { // when we make it final we can not inherit/override this method in child class
		System.out.println("Parent class -- start method");
	}
}

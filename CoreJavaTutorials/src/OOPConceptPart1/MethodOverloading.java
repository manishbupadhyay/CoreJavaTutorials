package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(20, 5);

	}
	
	// we can overload main method
	// You can not create a method inside a method
	// duplicate methods -- i.e. same method name with same number of arguments or input parameter is not allowed.
	
	// method overloading -- when the method name is same with different arguments or input parameters within the same class.
	public void sum() { // 0 input param
		System.out.println("sum method -- zero parameter");
	}
	
	public void sum(int i) { // 1 input param
		System.out.println("sum method -- 1 input param");
		System.out.println(i);
	}
	
	public void sum(int j, int k) { // 2 input param
		System.out.println("sum method -- 2 input param");
		System.out.println(j+k);
	}

}

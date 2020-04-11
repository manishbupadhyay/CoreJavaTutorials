package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
	// 1- while loop
	// Disadvantage of while loop : it will run infinite if you will not give increment/decrement
		
	int i = 1; // initialization
	while(i<=10) { // conditional
		System.out.println(i);
		i=i+1; // increment/decrement
	}
	
	System.out.println("********************");
	
	// 2- for loop
	for(int j=1;j<=10;j++) {
		System.out.println(j);
	}
	
	System.out.println("*******************");
	// print 10 to 1
	
	for(int k=10; k>=1;k--) {
		System.out.println(k);
	}
	}

}

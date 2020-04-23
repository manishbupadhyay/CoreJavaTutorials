package OOPConceptPart2;

public class FinalizeConcept {

	public void finalize() {
		System.out.println("finalize method");
	}
	//just before garbage collector, finalize method is called for cleanup process of objects
	
	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc();

	}

}

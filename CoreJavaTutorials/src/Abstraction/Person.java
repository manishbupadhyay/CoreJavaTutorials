package Abstraction;

public class Person implements OfficePerson, SchoolPerson {

	// Data abstraction is the process of hiding certain details and showing only essential information to the user. 
	//Abstraction can be achieved with either abstract classes or interfaces
	public void eat() {

	}

	public void walk() {

	}

	public void sleep() {

	}

	public void work() {
		System.out.println("I am a Office Person I can do Work");

	}

	public void attendInterview() {

	}
	
	public void study() {
		System.out.println("I am a School Person I can Study");
		
	}

	public void doHomeWork() {
		System.out.println("I am a School Person I can do my Home Work");
	}
	
	public void writeExam() {
		System.out.println("I am a School Person I can Write Exam");
	}

}

package JavaBasics;

public class B extends A {

	// if you want to print all the constructor which are in A

	// default constructor
	public B() {
		super();
	}

	// 1 param constructor
	public B(int i) {
		super(i);
	}

	// 2 param constructor
	public B(int i, int j) {
		super(i, j); // super keyword is used to called parent class constructor
		// inside a constructor we can not have 2 super keyword
		// System.out.println("child class constructor");
	}

	public static void main(String[] args) {

		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10, 20);

	}

}

// output : parent class constructor
//child class constructor
//parent class constructor called first because in this class first compiler
// will check that this class extend parent class A then it will go first
// in A class and check if there is any constructor present or not. If yes
// then it will check inside constructor if there is any printing stuff
// available or not if yes then it will first print that then it will print B constructor

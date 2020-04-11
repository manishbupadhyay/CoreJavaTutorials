package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// array : To store similar data types values in a array variable
		
		// 1. int array:
		// lowest bound/index = 0
		// upper bound/index = n-1 (where n is size of array)
		
		// one dimensional array
		
		// Advantage : we can store multiple value in a single data type
		
		// Disadvantage : 
		//1. size is fixed - static array - To overcome of this problem, we use collections == ArrayList, HashTable == use dynamic array
		//2. stores only similar data types - To overcome of this problem, we use object array.
		
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]); // ArrayIndexOutOfBoundExecption
		
		// to get size/length of array
		
		System.out.println(i.length);
		
		// print all the value of array
		
		for (int j=0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		
		System.out.println("********************");
		
		// 2. double array
		
		double d[] = new  double[3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.55;
		
		System.out.println(d[2]);
		
		System.out.println("********************");
		
		// 3. char array
		
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 2;
		c[2] = '5';
		
		System.out.println("********************");
		
		// 4. boolean array
		
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		System.out.println("********************");
		
		// 5. String array
		
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "Hello";
		s[2] = "World";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		System.out.println("********************");
		
		// 6. Object Array: (Object is a class) - is used to store different data types values
		
		Object ob[]  = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1990";
		ob[4] = 'M';
		ob[5] = "London";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
	}

}

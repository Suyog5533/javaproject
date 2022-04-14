package access_specifiers;

public class AS2 {

	public static void main(String[] args) {
		
		AS1 obj2 = new AS1();
		obj2.sample();
		obj2.sample2();
		//obj2.sample3();  // we cant call private method from another class
		System.out.println(obj2.a);
		//System.out.println(obj2.b); // we cant call private variable from another class

	}

}

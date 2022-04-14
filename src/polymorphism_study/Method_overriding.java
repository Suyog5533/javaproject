package polymorphism_study;

public class Method_overriding {

	public static void main(String[] args) {
		A a= new A();// creating object of super class
		B b = new B();// creating object of sub class
		
		a.wish();// calling super class property
		b.wish();// calling subclass property

	}

}

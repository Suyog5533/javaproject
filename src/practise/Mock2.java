package practise;

public class Mock2 {

	public static void main(String[] args) {
		Mock.subtraction();
		
		Mock ob1 = new Mock();
		
		System.out.println("The value of a is "+ob1.a); // non static global variable calling from another class
		System.out.println("The value of b is "+Mock.b);// static global variable calling from another class
		Mock.subtraction(); // static method from another class
		 ob1.addition(); // non static method from another class
	}

}
 
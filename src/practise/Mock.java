package practise;

public class Mock {
   int a=10;  // non static global variable 
   static int b=30; // static global variable 
   int x = 500;
	public void addition()
	{
		
		int c=150; // local variable 
		x= x +50;
		int d=200; // local variable 
		int sum = x+d+a+b+c;
		System.out.println("The addition is "+sum);
		
		System.out.println("updated value of x is "+x);

	}
	public static  void subtraction()
	{
		int e=100;
		int f=150;
		int sub= e-f-b;
		Mock ob2 = new Mock();
		System.out.println("The subtraction is "+sub);
		System.out.println("value of old x is"+ob2.x);

	}
	public static void main(String[] args) {
		Mock ob1= new Mock();
	ob1.addition();
		subtraction();
		System.out.println("value of x "+ob1.x);
		//System.out.println("value of b is "+b); // static global variable calling
		
		//System.out.println("value of a is "+ob1.a); // non static global variable calling
		
		
		
	}

}

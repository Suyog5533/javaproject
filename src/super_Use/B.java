package super_Use;

public class B extends A {
	int a=90;// global variable form B class
int b=9999;
	public static void main(String[] args) 
	{
		B b= new B();// created object of class B
		b.test();// calling non static method using object

	}
	
	public void test()
	{
		int a=9;//local value of a 
		System.out.println("Local vlaue of a is "+a);
		System.out.println("Global value of A form B class is "+this.a);
		System.out.println("Global value of A form A class is "+super.a);
		System.out.println(super.b);
		
		
	}
	

}
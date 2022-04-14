package this_use_study;

public class This_study {
        int a=100;// non-Static global  variable
		int c=20;
		static int b=300;// static global variable
		public static void main(String[] args) {	
			This_study ts= new This_study();
			ts.test();

		}
		
		public void test()
		{
			//int b=300;
			int a=50;// local variable
			int sum=10+a;// using local value of a-->50
			System.out.println("Printing local value of a "+a);
			System.out.println("Prinitng globle value of a "+this.a);
			System.out.println("Sum value is "+sum);
			
			int sum1=10+this.a;//using global value of a-->100
			System.out.println("Sum is "+sum1);
			test2();
		}
		
		public static void test2()
		{
			int sub=200-b;
			System.out.println("The sub is "+sub);
			//in static method we can only static variable--> we cant call non static variables
			
		}

	}
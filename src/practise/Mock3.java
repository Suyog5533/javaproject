package practise;

public class Mock3 {
	int a=50;
	public void additon()
	{
		a = a+10;
	 int b = 100;
	 int sum = a+b;
	 System.out.println("The addition is "+sum);
	}
	public void subtraction()
	{
		int c = 150;
		int sub = a-c;
		System.out.println("The subtraction is "+sub);
	}
	public static void main(String[] args) {
		Mock3 ob1 = new Mock3();
		System.out.println("The value of a is "+ob1.a);
		ob1.additon();
		System.out.println("The value of a is "+ob1.a);
	   ob1.subtraction();
	   
		
		}
}


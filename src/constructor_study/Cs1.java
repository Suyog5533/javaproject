package constructor_study;

public class Cs1 {
	int a;
	int b;
	int c;	
public Cs1()
{
	System.out.println("Default Constructor is running");
	a=10;
	b=20;
	c=30;	
}
public Cs1(int num)
{
	System.out.println("Constructor with one parameter is running");
	a=num;	
}
public Cs1(int num, int num2)
{
	System.out.println("Constructor with two parameter is running");
	a=num;
	b=num2;	
}
public Cs1(int num, int num2, int num3)
{
	System.out.println("Constructor with three parameter is running");
	a=num;
	b=num2;
	c=num3;
}
	public static void main(String[] args) {
	Cs1 ob1= new Cs1();
	ob1.addition();
	Cs1 ob2 = new Cs1(100);
	ob2.addition();
	Cs1 ob3 = new Cs1(100,200);
	ob3.addition();
	Cs1 ob4 = new Cs1(100,200,300);
	ob4.addition();
	}
	public void addition()
	{
		int sum=a+b+c;
	System.out.println("The addition is "+sum);	
	}
	}

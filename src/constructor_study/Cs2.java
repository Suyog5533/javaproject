package constructor_study;

public class Cs2 {
int a;
int b;
int c;
public Cs2() //constructor without parameter
{
	a=50;
	b=100;
	c=200;
}
public Cs2(int num) 
{
	a=num;
	System.out.println("Constructor with one parameter is running");
	
}
public Cs2(int num,int num2)
{
	a=num;
	b=num2;
}
public Cs2(int num, int num2, int num3)
{
	a=num;
	b=num2;
	c=num3;
}
	public static void main(String[] args)
	{
	
		Cs2 ob1 = new Cs2();
		ob1.addition();
		Cs2 ob2 = new Cs2(500);
		 ob2.addition();
		 Cs2 ob3 = new Cs2(500,500);
		 ob3.addition();
		 Cs2 ob4 = new Cs2(500,1000,1500);
		 ob4.addition();
	}
public void addition()
{
	int sum= a+b+c;
	System.out.println("The addition is "+sum);
}
}

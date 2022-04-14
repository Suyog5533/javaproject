package access_specifiers;

public class AS1 {
int a=10;
private int b=50;
protected int c=100;
public int d=200;
public static void main(String[] args) {
	AS1 obj = new AS1();
	obj.sample();
	obj.sample2();
	obj.sample3();
	System.out.println(obj.a);
	System.out.println(obj.b);
	System.out.println(obj.c);
    System.out.println(obj.d);
	}
public void sample()
{
	System.out.println("calling default method "+a);
}
protected void sample2()
{
	System.out.println("calling protected method  "+b);
}
private void sample3()
{
	System.out.println("calling private method  "+d);
}
}

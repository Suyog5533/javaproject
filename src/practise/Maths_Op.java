package practise;

public class Maths_Op {

	public static void main(String[] args) {
		Maths_Op ob1= new Maths_Op();
		ob1.op1();
		Maths_Op ob2 = new Maths_Op();
		ob2.op2(100,200);
	}
public void op1() //method without parameter
{
	int a=10;
	int b=20;
	int sum = a+b;
	int sub = a-b;
	System.out.println("the addition is "+sum);
	System.out.println("the subtraction is "+sub);
} 
public void op2(int a, int b)
{
	int sum= a+b;
	int sub= a-b;
	System.out.println("The addition is "+sum);
	System.out.println("The subtraction is "+sub);
}

}
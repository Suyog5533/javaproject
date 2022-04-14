package practise;

public class Practise {

	public static void main(String[] args) {
		System.out.println("Hello World");
		char name;
		name= 'a';
		System.out.println(name);
		Practise ob1= new Practise();
		ob1.test("suyog",45,'a');
		ob1.test2(10,20,30.5f);
		
	}
		public void test(String name, int Roll_No, char grade )
		{
 System.out.println("my name is "+name);
 System.out.println("my roll no is "+Roll_No);
 System.out.println("My grade is "+grade);
	}
public void test2(int a, int b, float c)
{
	float sum = a+b+c;
	System.out.println("The addition is "+sum);
	
}
}

package constructor_study;

public class Cs3 {
  float a;
  int b;
  int c;
  
  public Cs3() // constructor without parameter or zero parameter
  {  
	  a=10.5f;
	  b=20;
	  System.out.println("Running constructor without paramter");
  }
	public Cs3(int num) // constructor with one parameter
	{
	a=num;
	System.out.println("Running constructor with one parameter");
	}
	
	public Cs3(int num, int num1) // constructor with two parameters
	{
	a=num;
	b=num1;
	System.out.println("Running constructor with two parameter");
		
	}
	public static void main(String[] args) {
		Cs3 ob1 = new Cs3();
		ob1.additon();
		Cs3 ob2 = new Cs3(500);
		ob2.additon();
		Cs3 ob3 = new Cs3(500,1000);
		ob3.additon();

	}
	
	public void additon()
	{
		float sum = a+b;
		System.out.println("The addition is "+sum);
		
	}

}

package interface_study;

public class Class_1 implements Interface1,Interface2 {

	public static void main(String[] args) 
	
	{
	Class_1 ob = new Class_1();
	ob.divide();
	
	}

	@Override
	public void divide() {
	 int a=100;
	 int b=50;
	 int divison=a/b;
	 System.out.println(divison);
	}

	@Override
	public void multi() {
		// TODO Auto-generated method stub
		
	}

}

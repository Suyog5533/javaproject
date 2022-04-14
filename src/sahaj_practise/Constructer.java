package sahaj_practise;

public class Constructer {
int c;
int d;
	public Constructer()
	{
		int c=500;
		int d=1000;
		int sum = c+d;
		System.out.println(sum);
	}
		public Constructer(int value1, int value2)
		{  c=value1;
		   d=value2;
           int sum = value1+value2;
			System.out.println(sum);
	}
	public static void main(String[] args) {
	   
		Constructer ob1 = new Constructer();
		
		Constructer ob2 = new Constructer(50,100);
		Constructer ob3 = new Constructer(200,100);
		Constructer ob4 = new Constructer(800,100);

	}

}

package casting_study;

public class Primitive_Casting {

	public static void main(String[] args) {

		int a=5;// lower data type information
		System.out.println(a);
		
		double b=a;//converted to higher data type info-- Implicit casting or  wideing castiong
		System.out.println(b);
		
		double z=10.5;// higher data type
		
		System.out.println(z);
		
		int y=(int)z;// converted to lower type info--explicit casting or narrowing casting
		
		System.out.println(y);

	}


	}



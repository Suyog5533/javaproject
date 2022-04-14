package additionEquation;

public class Equation {

	public static void main(String[] args) {
	
//		int equation = (5+3)*2;
		Opration op = new Opration();
		int sum = op.add(5, 3);
		int mul = op.multiply(sum, 2);		
		System.out.println("answer is "+mul);
	}

}

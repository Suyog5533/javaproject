package condition_study;

public class Switch_study {

	public static void main(String[] args) {
		// int year
		// 1< I'm in 1st year Engg.
		// 2< I'm in 2st year Engg.
		// 3< I'm in 3st year Engg.
		// 4< I'm in 4st year Engg.
		
		String year="2";
		switch (year) {
		case "1":System.out.println("I'm in 1st year Engg.");
		break;
		case "2":System.out.println("I'm in 2st year Engg.");
		break;
		case "3":System.out.println("I'm in 3st year Engg.");
		break;
		case "4":System.out.println("I'm in 4st year Engg.");
		break;
		default:System.out.println("Enter the value between 1 to 4");
		break;
		}





	}

}

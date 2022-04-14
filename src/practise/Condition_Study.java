package practise;

public class Condition_Study {

	public static void main(String[] args) {
		int Parked_cars=35;
		if (Parked_cars > 1 && Parked_cars <= 25 )
				{
		System.out.println("Park ur car at level 1");
				}
		else if (Parked_cars >25 && Parked_cars <= 50) 
		{
			System.out.println("Park ur car at level 2");
		}
		else if (Parked_cars >51 && Parked_cars <= 100) 
		{
			System.out.println("Park ur car at level 3");
		}
		else if (Parked_cars >100) 
		{
			System.out.println("Parking Full");
		}
		

	}

}

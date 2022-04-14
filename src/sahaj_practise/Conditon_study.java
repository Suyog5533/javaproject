package sahaj_practise;

public class Conditon_study {

	public static void main(String[] args) {
	// if bank balance is between 5k to 10k then insteret 5%
		// if bank balance is <= 5k  then insteret 3%
		// if bank balance is < 10k then insteret 10 %
	int bankBalance = 8888;
if (bankBalance<=5000)
	{
		System.out.println("Interest is 3 %");
	}
else
{
	if (bankBalance >=10000)
	{
		System.out.println("Interest is 10 %");
	}
	else
	{
		System.out.println("Interest is 5 %");
	}
}
	}

}

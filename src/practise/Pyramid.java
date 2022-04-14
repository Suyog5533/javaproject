package practise;

public class Pyramid {

	public static void main(String[] args) {
		//    *
		//   * *
		//  * * *
		// * * * *

		int star=1;
		int space=8;
		
		for(int i=1;i<=10;i++)
		{
			for(int j=8;j>=space;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			
			space--;
			star++;
			System.out.println();
			
		}
		
	}

}

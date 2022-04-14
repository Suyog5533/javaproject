package impProgrammes;

public class amstrongNo2 {

	public static void main(String[] args) {
		int num=154;
		int addition=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem = i%10;
			addition=addition+(rem*rem*rem);
		}
		if(addition==num)
		{
			System.out.println("It is amstrong number");
		}
		else 
		{
			System.out.println("Not amtsrong no");
		}
			

	}

}

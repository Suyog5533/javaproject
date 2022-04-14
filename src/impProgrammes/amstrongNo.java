package impProgrammes;

public class amstrongNo {

	public static void main(String[] args) {
		
		int a=372;
		int sum=0;
		int digit=0;
		int temp=a;
		
		while(temp>0)
		{
			digit=temp%10;
			temp=temp/10;
			sum=sum+(digit*digit*digit);	
		}
		if(sum==a)
		{
			System.out.println(a+" is an amstrong no");
		}
		else
		{
			System.out.println("It is not amstrong no");
		}

	}

}

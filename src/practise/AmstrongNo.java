package practise;

public class AmstrongNo {

	public static void main(String[] args) {
	
	int mynum=153;
	int addition=0;
	for(int i=mynum;i>0;i=i/10)
	{
		int reminder = i%10;
		addition=addition+(reminder*reminder*reminder);
	}
	
	if(mynum==addition)
	{
		System.out.println("Numder is amstrong");
	}
	}
}

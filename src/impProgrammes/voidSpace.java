package impProgrammes;

public class voidSpace {

	public static void main(String[] args) {
		String name="Suyog C Wagaskar";
		int counter=0;
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char space = name.charAt(i);
			if(space==' ')
			{
				counter++;
				
			}
		}
		System.out.println(counter);	

	}

}

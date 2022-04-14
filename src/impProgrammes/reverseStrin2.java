package impProgrammes;

public class reverseStrin2 {

	public static void main(String[] args) {
		String name = "ajit";
		String reverse ="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
			
		}
		System.out.println(reverse);
		
		if(reverse.equals(name))
		{
			System.out.println("name is pallindrome");
		}
		

	}

}

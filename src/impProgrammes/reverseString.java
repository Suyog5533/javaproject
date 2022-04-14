package impProgrammes;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		
		//String a= "nitin";
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter any name");
		String a=s.next();
		String reverse = "";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			reverse=reverse+a.charAt(i);
		
		}
          System.out.println(reverse);
	
	if(reverse.equals(a))
	{
		System.out.println("Name is pallindrome");
	}
	else {
		System.out.println("Name is not pallindrome");
	}

}
}

package array;

import java.util.Arrays;

public class Array_study2 {

	public static void main(String[] args) {
		
		int RollNo[]= new int[5];
		
		RollNo[0]=30;
		RollNo[1]=10;
		RollNo[2]=50;
		RollNo[3]=40;
		RollNo[4]=20;
		
		System.out.println("=====printing as it is=====");
		//System.out.println(RollNo[3]);
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(RollNo[i]);
		}
		Arrays.sort(RollNo);
		System.out.println("=====printing in asending order=====");		

		for(int i=0;i<=4;i++)
		{
			System.out.println(RollNo[i]);
		}
		
		System.out.println("=====printing in decending order=====");	
		
	for(int i=4;i>=0;i--)
	{
		System.out.println(RollNo[i]);
	}
	
	}
}



package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_study {

	public static void main(String[] args) {
		String name[]= new String[5];
		name[0]="Suyog";
		name[1]="is";
		name[2]="placed";
		name[3]="in";
		name[4]="Google";
		
		//System.out.println(Arrays.asList(name));   to call array in list
		
		System.out.println(name[2]);
		
		for(int i=0;i<=4;i++)
		{
	
			System.out.print(name[i]+" ");
			
		}
		System.out.println("===============");

		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		
		System.out.println("==========Array for char=============");
		 char grade[]= new char[10];
		 grade[0]='a';
		 grade[1]='b';
		 grade[2]='c';
		 grade[3]='d';
		 grade[4]='e';
		 grade[5]='f';
		 
		 for(int g=0;g<=5;g++) //1st method to call array
		 {
			 System.out.println(grade[g]);
		 }
//		 for(int g=0;g<=grade.length-1;g++) 2 method to call array
//		 {
//			 System.out.println(grade[g]);
//		 }
		 System.out.println("==================");
		
		
		 int ss1[]= {1,2,3,4,5,6,7,8,9};
		 
		 
		System.out.println(Arrays.asList(ss1));
		
//		 for(int i=0;i<=9;i++)
//		 {
//			 System.out.println(ss1[i]);
//		 }
	}

}

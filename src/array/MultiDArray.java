package array;

import java.util.Arrays;

public class MultiDArray {

	public static void main(String[] args) {
		
		int md[][]= new int[2][2];
		md[0][0]=1;
		md[0][1]=2;
		md[1][0]=3;
		md[1][1]=4;
		
//		for(int i=0;i<=md.length-1;i++)
//		{
//			for(int j=0;j<=md.length-1;j++)
//			{
//				System.out.print(md[i][j]+" ");
//			}
//			System.out.println();
//		}
		for(int i=0;i<=md.length-1;i++)
		{
			for(int j=0;j<=md.length-1;j++) {
				
			System.out.print(Arrays.asList(md[i][j])+" ");
		}
			System.out.println();
		}
	}
}
	

		

	



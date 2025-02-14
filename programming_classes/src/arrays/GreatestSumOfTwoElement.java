package arrays;

import java.util.Scanner;

public class GreatestSumOfTwoElement {
	public static void main(String[] args) {
		int[] ar = ArrayOperations.readarray();
		
		
		int sum =0;
		for(int i=0;i<ar.length;i++) {
			
			for(int j=i+1;j<ar.length;j++) {
				
				if(ar[i]+ar[j]>sum) 
				{
					sum=ar[i]+ar[j];
					
				}
				
			}

		}
		System.out.println("Greatest sum of Two Element:"+sum);

	}
}
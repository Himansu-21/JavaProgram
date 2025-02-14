package arrays;

import java.util.Scanner;

public class DistinctElementArray {
	public static void main(String[] args) {
		
		int[] ar1 = ArrayOperations.readarray();
		int[] ar2 = ArrayOperations.readarray();
		
		findDistinct(ar1,ar2);
		findDistinct(ar2,ar1);
	}
	
	public static void findDistinct(int[] ar1,int[] ar2) {
		for(int i =0;i<ar1.length;i++) {
			
			int count =0;
			for(int j=0;j<ar2.length;j++) {
				if(ar1[i]==ar2[j]) {
					count++;
					break;
				}
			
			}
			if(count==0)
			System.out.println(ar1[i]);
 
			
		}
	}

}

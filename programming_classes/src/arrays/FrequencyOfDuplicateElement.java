package arrays;

import java.util.Scanner;
 
public class FrequencyOfDuplicateElement {
	public static void main(String[] args) {
		int[] ar = ArrayOperations.readarray();
		
		
		for(int i=0;i<ar.length;i++) {
			int count=1;
			for(int j=i+1;j<ar.length;j++) {
				
				if(ar[i]==ar[j]) {
					count++;
					ar[j]=Integer.MIN_VALUE;
					
				}
				
			}
			if(ar[i]!=Integer.MIN_VALUE && count>=2)
				System.out.println(ar[i]+"----> "+count);
			
		}
	

	}
}
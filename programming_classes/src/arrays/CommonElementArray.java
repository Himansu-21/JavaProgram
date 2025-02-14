package arrays;

import java.util.Scanner;

public class CommonElementArray {
	public static void main(String[] args) {
		
		int[] ar1 = ArrayOperations.readarray();
		int[] ar2 = ArrayOperations.readarray();
		
		findCommon(ar1,ar2);
	}
	
	public static void findCommon(int[] ar1,int[] ar2) {
		for(int i =0;i<ar1.length;i++) {
			
			boolean flag = true;
			for(int j=0;j<ar2.length;j++) {
				
				if(ar1[i]==ar2[j]) {
				//System.out.println("Common Element:"+ ar1[i]);
					ar2[j]=0;
					flag = false;
				}
			}
		
			if(flag==false) {
				System.out.println(ar1[i]);
		}
		}
		
	}

}

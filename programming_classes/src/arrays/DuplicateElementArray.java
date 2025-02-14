package arrays;

import java.util.Scanner;

public class DuplicateElementArray {
	public static void main(String[] args) {
		
		int[] ar = ArrayOperations.readarray();
		                                          
		findDuplicate(ar);
	}
	
	public static void findDuplicate(int[] ar) {
		for(int i =0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i] == ar[j])
					System.out.println("Duplicate Element"+ar[i]);
			}
		}
	}

}

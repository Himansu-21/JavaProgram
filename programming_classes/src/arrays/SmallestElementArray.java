package arrays;

import java.util.Scanner;

public class SmallestElementArray {
	public static void main(String[] args) {
		int [] ar= {1,2,5,4,3};
		int small =ar[0];

		for(int i=1;i<ar.length;i++) {
			if(ar[i]<small)//find smallest element
					small= ar[i];
		}

		System.out.println("Smallest Element is "+small);
	}

}

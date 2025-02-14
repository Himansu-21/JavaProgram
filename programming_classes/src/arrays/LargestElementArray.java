package arrays;

import java.util.Scanner;

public class LargestElementArray {
	public static void main(String[] args) {
		int [] ar= {1,2,5,4,3};
		int large =ar[0];

		for(int i=1;i<ar.length;i++) {
			if(ar[i]>=large)//find largest element
//				if(ar[i]<large)//find smallest element
					large = ar[i];
		}

		System.out.println("Largest Element is "+large);
	}

}

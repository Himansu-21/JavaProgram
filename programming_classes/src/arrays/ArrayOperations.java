package arrays;

import java.util.Scanner;

public class ArrayOperations {
	
	//to read data from user and create array and store the elements
	public static int[] readarray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		int[] ar = new int[size];
		
		System.out.println("Enter the element");
		for(int i = 0; i < ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}
	
	//to display the data present in an array
	
	public static void display (int[] ar) {
		for(int j = 0; j<ar.length;j++) {
			System.out.println(ar[j]+" ");
		}
	}

}

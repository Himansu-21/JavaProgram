package arrays;

import java.util.Scanner;

class ProgramIntArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[3];
		
		for(int i=0;i<x.length;i++)
			x[i] = sc.nextInt();
		
		System.out.println("Printing values from array");
		
		for(int i=0;i<x.length;i++)
			System.out.println(x[i]);
		
		sc.close();
	}

}

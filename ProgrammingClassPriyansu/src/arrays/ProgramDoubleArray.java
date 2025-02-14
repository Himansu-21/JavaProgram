package arrays;

import java.util.Scanner;

class ProgramDoubleArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double[] d = new double[3];
		
		for(int i=0;i<d.length;i++)
			d[i] = sc.nextDouble();
		
		System.out.println("Printing values from array");
		
		for(int i=0;i<d.length;i++)
			System.out.println(d[i]);
		
		sc.close();
	}

}

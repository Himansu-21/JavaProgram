package arrays;

import java.util.Scanner;

public class arr1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array elements");
		double [] d = new double[3];

		for(int i = 0;i<d.length;i++) 
		{
			d[i] = sc.nextDouble();
		}

		System.out.println("--------------");

		for(int j=0;j<d.length;j++)
		{
			System.out.println(d[j]);
		}
	}

}

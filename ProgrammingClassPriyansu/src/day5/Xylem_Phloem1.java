package day5;

import java.util.Scanner;

public class Xylem_Phloem1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();

		int sumExtreme = n%10;
		n=n/10;
		int sumMeans = 0;
		
		while(n>9)
		{
			int digit = n%10;
			sumMeans+=digit;
			n=n/10;			
		}
		
		sumExtreme+=n;
		
		if(sumExtreme==sumMeans)
			System.out.println("Xylem Number");
		else
			System.out.println("Phloem Number");
		
		sc.close();
	}

}

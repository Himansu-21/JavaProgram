package day3;

import java.util.Scanner;

public class AvgNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		
		double sum =0;
		double count=0;
		
//		System.out.println(n);
		
		while(n>0)
		{
			int digit = n%10;
//			System.out.println(n);
			sum+=digit;
			count++;
			n=n/10;
		}
		
		double avg = sum/count;
		
		System.out.println(sum);
		System.out.println(count);
		System.out.println("The average of digits in the number is "+avg);
		
		sc.close();
	}

}

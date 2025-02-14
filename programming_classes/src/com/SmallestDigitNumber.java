package com;

import java.util.Scanner;

public class SmallestDigitNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int small = 10;
		
		while(n!=0) {
			int digit = n%10;
			if(digit<small) 
				small = digit;
				n=n/10;
			}
		
		System.out.println("Smallest number: "+small);
		sc.close();
	}
}

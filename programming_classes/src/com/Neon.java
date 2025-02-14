package com;

import java.util.Scanner;

public class Neon {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number");
		int a = sc.nextInt();
		
		int square = a*a;
		int sum = 0;
		
		while (square!=0) {
			
			int digit = square%10;
			sum = sum + digit;
			square = square/10;
		
		}
		
		if(sum == a) {
			System.out.println("it is a neon number: ");
		}
		else {
			System.out.println("it is not a neon number: ");
		}
	}
}

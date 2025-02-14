package com;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
     
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		int rev=0;
		int temp = n;
		while(temp!=0) {
			int digit = temp%10;
			rev = rev*10+digit;
			temp=temp/10;
		}

		if (n==rev)
			System.out.println("it is a palindroem");
		else
			System.out.println("it is not a palindrome");
	}
}

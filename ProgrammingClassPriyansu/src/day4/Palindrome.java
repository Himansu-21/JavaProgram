package day4;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int temp=n;
		int rev =0;
		
		while(temp!=0)
		{
			int digit=temp%10;
			
			rev=rev*10+digit;
			
			temp=temp/10;
		}
		
		if(n==rev)
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
		
		sc.close();
	}

}

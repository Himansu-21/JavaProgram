package day3;

import java.util.Scanner;

public class NeonNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		int a = n*n;
		int sum = 0;
		
		while(a!=0)
		{
			int digit = a%10;
			sum+=digit;
			a=a/10;
		}
		
		if(sum==n)
			System.out.println("It is a Neon Number! ");
		else
			System.out.println("It is not a Neon Number! ");
		
		sc.close();
	}

}

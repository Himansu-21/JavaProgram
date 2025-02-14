package day3;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		// to count if n is getting divided
		int count=0;
		
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				//n is getting divided no need to check for more
				count++;
				break;
			}
		}
		
		//if prime count should be 0 i.e. not divisible by any other no other than 1,itself
		if(count!=0)
			System.out.println("Not a prime number");
		else
			System.out.println("Is a prime number");
		
		
		sc.close();
	}

}

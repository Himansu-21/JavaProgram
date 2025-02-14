package day4;

import java.util.Scanner;

public class PrimeUsingMethod {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n= sc.nextInt();
		
		boolean flag =isPrime(n);
		
		if(flag)
			System.out.println("it is a prime number");
		else
			System.out.println("it is not a prime number");
		
		sc.close();
	}
	
	public static boolean isPrime(int n)
	{
		int i=2;
		do
		{
			if(n%i==0 && n!=2)
			{
				return false;
			}
			
			i++;
			
		}while(i<n);
		
		
		return true;
	}

}

package day3;

import java.util.Scanner;

public class PrimeNumberDoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		boolean flag=true;
		int i=2;
		
		do
		{
			if(n%i==0 && n!=2)
			{
				flag=false;
				break;
			}
			
			i++;
			
		}while(i<n);
		
		if(flag)
			System.out.println("It is a prime number");
		else
			System.out.println("It is Not a prime number");
		
		sc.close();
		
	}
}

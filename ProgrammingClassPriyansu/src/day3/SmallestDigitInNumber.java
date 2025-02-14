package day3;

import java.util.Scanner;

public class SmallestDigitInNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int n = sc.nextInt();

		int smallest =10;
		
		while(n!=0)
		{
			int digit = n%10;
			
//			using ternary operator
//			smallest=digit<smallest?digit:smallest;
			
//			using conditional statements
			if(smallest>digit)
				smallest=digit;
			
			n=n/10;
		}
		
		System.out.println("The smallest digit is "+smallest);
		
		
		sc.close();
	}

}

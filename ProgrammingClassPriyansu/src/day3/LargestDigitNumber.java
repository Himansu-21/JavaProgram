package day3;

import java.util.Scanner;

public class LargestDigitNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int n = sc.nextInt();

		int largest =0;
		
		while(n!=0)
		{
			int digit = n%10;
			
//			using ternary operator
//			largest=digit>largest?digit:largest;
			
//			using conditional statements
			if(largest<digit)
				largest=digit;
			
			n=n/10;
		}
		
		System.out.println("The largest digit is "+largest);
		
		
		sc.close();
	}
}

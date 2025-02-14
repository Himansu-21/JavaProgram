package day5;

import java.util.Scanner;

public class StrongNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		
		int factSum=0;
		int num =n;

		while(n!=0)
		{
			int digit=n%10;
			int fact =1;
			
			for(int i=1;i<=digit;i++)
			{
				fact=fact*i;
			}
			
			factSum+=fact;
			n=n/10;
		}
		
		if(factSum==num)
			System.out.println("It is a Strong Number");
		else 
			System.out.println("It is Not a Strong Number");
		
		sc.close();
		
	}

}

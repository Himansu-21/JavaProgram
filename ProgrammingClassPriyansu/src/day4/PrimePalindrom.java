package day4;

import java.util.Scanner;

class PrimePalindrom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n= sc.nextInt();
		
		boolean flag =true;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		
		if(flag)
		{
			int rev=0;
			int tmp=n;
			
			while(tmp!=0)
			{
				int digit = tmp%10;
				rev=rev*10+digit;
				tmp=tmp/10;
			}
			
			if(rev==n)
			{
				System.out.println("It is a prime palindrome Number");
			}
			else
			{
				System.out.println("It is not a prime palindrome Number");
			}
		}
		else
			System.out.println("It is not prime palindrome Number");
		
		sc.close();
	}
}

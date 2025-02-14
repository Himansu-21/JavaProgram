package day4;

import java.util.Scanner;

public class PrimeInRangeUsingMethod {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++)
		{
			boolean res = isPrime(i);
			
			if(res)
				System.out.println(i);
		}
		
		sc.close();
	}
	
	public static boolean isPrime(int n)
	{
		boolean flag=true;
		
		if (n<=1)
		{
			flag=false;
		}
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag = false;
				break;
			}
		}
		
		return flag;
	}

}

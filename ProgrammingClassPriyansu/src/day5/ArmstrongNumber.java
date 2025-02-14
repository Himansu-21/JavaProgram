package day5;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int count =0;
		
		for(int num = n;num!=0;num/=10)
			count++;
		
		
		int sum=0;
		
		
		for(int num = n;num!=0;num/=10)
		{
			int digit=num%10;
			int prod =1;
			for(int i=1;i<=count;i++)
			{
				prod = prod*digit;
			}
			
			sum+=prod;
		}
		
		if (sum==n) {
			System.out.println("It is an Armstrong Number");
		}
		else {
			System.out.println("It is Not an Armstrong Number");
		}
		sc.close();
	}

}

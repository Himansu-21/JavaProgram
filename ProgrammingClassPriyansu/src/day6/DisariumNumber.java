package day6;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		boolean flag = isDisariumNumber(num);

		if(flag)
			System.out.println("It is a Disarium Number");
		else
			System.out.println("It is Not a Disarium Number");

		sc.close();
	}

	public static boolean isDisariumNumber(int num)
	{
		int count=0;

		for(int n=num;n!=0;n/=10)
			count++;

		int sum=0;

		for(int n=num;n!=0;n/=10)
		{
			int digit=n%10;
			int prod =1;

			for(int i=1;i<=count;i++)
			{
				prod=prod*digit;
			}

			sum+=prod;			
			count--;
		}
		if(sum==num)
			return true;
		else
			return false;
		
		
	}

}

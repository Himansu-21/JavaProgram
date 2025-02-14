package day7;

import java.util.Scanner;

public class HappyNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
//		boolean flag=true;
		
		int res = isHappyNumber(n);
		
		if(res==1)
			System.out.println("It is a Happy Number");
		else
			System.out.println("It is Not a Happy Number");
		
		
		sc.close();
	}
	
	public static int isHappyNumber(int n)
	{
		while(n!=1 && n!=4)
		{
			int sum=0;
			while(n!=0)
			{
				int digit = n%10;
				sum+=(digit*digit);
				n=n/10;
			}
			
//			if(sum==4)
//			{
//				flag=false;
//				break;
//			}
			
			n=sum;
						
		}
		return n;
	}

}

package day8;

import java.util.Scanner;

public class DuckNumber {
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n= sc.nextInt();
		
		boolean flag = false;
		
		while(n!=0)
		{
			int digit = n%10;
			
			if(digit==0)
			{
				flag = true;
				break;
			}
						
			n=n/10;
			
		}
		
		if(flag)
			System.out.println("It is a Duck Number");
		else 
			System.out.println("It is Not a Duck Number");
		
		sc.close();
	}

}

package day4;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int sunny=n+1;
		boolean flag=false;
		
		for(int i=1;i<sunny;i++)
		{
			if(i*i==sunny)
			{
				flag=true;
				break;					
			
			}
		}
	
		if(flag)
			System.out.println("It is a Sunny Number");
		else
			System.out.println("It is Not a Sunny Number");
		
		sc.close();
	}
}

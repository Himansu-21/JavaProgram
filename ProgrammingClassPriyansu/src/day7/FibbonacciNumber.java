package day7;

import java.util.Scanner;

public class FibbonacciNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int n1 =0,n2=1;
		
		for (int i = 1; i <n; i++) 
		{
			int n3=n2+n1;
			System.out.println(n3);
			
			n1=n2;
			n2=n3;
			
		}
		
		sc.close();
	}
}

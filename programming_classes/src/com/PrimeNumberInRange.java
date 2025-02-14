package com;

import java.util.Scanner;

public class PrimeNumberInRange {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a Number");
			int n = sc.nextInt();
			
			//calling another method
			
			for(int i=1;i<=n;i++) {
				boolean result = isPrime(i);
				if(result == true)
					System.out.println(i);
			}
		}
		
	public static boolean isPrime(int n) {
		boolean flag = true;
		
		for(int i =2; i<n;i++) {
			if(n%i== 0) {
				flag = false;
				break;
			}
		}
		return flag;
		
	}
}

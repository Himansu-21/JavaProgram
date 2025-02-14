package com;

import java.util.Scanner;

public class Simple {
	public static void main(String[] args) {
		
		System.out.println("start");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values :-");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			System.out.println(a/b);//write inside the try block
		}
		catch(ArithmeticException e){
			System.out.println("Not divided by Zero");
			
		}
		
//		System.out.println(a/b);
	
		System.out.println("End");
	
	}
	

}

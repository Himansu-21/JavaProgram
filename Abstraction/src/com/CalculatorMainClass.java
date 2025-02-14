package com;

import java.util.Scanner;

class CalculatorMainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number:");
		int n1=sc.nextInt();

		System.out.println("Enter 2nd Numebr:");
		int n2=sc.nextInt();
		sc.close();

		Calculator calc = new CalculatorImpl();  // rule-4

		calc.add(n1, n2);
		calc.mul(n1, n2);

	}
}

// Here in this abstraction is achieved by using super interface reference as no super class;

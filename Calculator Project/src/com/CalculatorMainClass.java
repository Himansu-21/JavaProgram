package com;

import java.util.Scanner;

public class CalculatorMainClass {
	public static void main(String[] args) {


		System.out.println("Welcome to Calculator Project");
		System.out.println("-----------------------------");

		Scanner sc = new Scanner(System.in);

		Calculator c = new CalculatorImpl();//upcasting for abstraction

		//infinite loop
		while(true) {
			System.out.println("1:Addition\\ 2: Substraction");
			System.out.println("3.Multiplication\\ 4.Division \\5.Exit");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();

			/*
			 *local variable doesnot have default values
			 *therefore initializing it to 0 explicitly
			 *declearing x and y outside if because to increase visibility
			 */
			int a = 0;
			int b = 0;

			//Accepting two number when choice is 1,2,3 & 4

			if(choice>=1 && choice<=4) { 
				System.out.println("Enter 2 number");
				a = sc.nextInt();
				b = sc.nextInt();
			}

			switch(choice){
			case 1:
				System.out.println("addition of two number:");
				c.add(a, b);
				break;

			case 2:
				System.out.println("substracion of two number");
				c.sub(a,b);
				break;

			case 3:
				System.out.println("product of two number");
				c.mul(a,b);
				break;

			case 4:
				System.out.println("division of two number");
				c.sub(a,b);
				break;

			case 5:
				System.out.println("Thank You!!");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid Choice");

			}
		}
	}
}

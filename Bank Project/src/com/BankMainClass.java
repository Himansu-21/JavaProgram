package com;

import java.util.Scanner;

class BankMainClass {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Bank Project!");
		System.out.println("------------------------");
		
		Scanner sc = new Scanner(System.in);
		Bank b = new BankImpl();
		
		
		while(true)
		{
			System.out.println("-----Bank Menu-----");
			System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n");
			
			System.out.println("-----------");
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			
			int amt = 0;
			if(choice ==1 || choice == 2)
			{
				System.out.println("Enter amount :");
				amt = sc.nextInt();
			}
			
			switch(choice)
			{
			case 1:
				b.deposit(amt);
				break;
			
			case 2:
				b.withdraw(amt);
				break;
			
			case 3:
				b.checkBalance();
				break;
			
			case 4:
				System.out.println("Thank You!");
				System.exit(0);
			
			default:
				System.out.println("Invalid Choice!");
					
			}
		}
	}

}

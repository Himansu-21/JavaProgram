package com;

import java.util.Scanner;

class BankMainClass {
	
	public static void main(String[] args) {
		
		Bank b = new BankImpl();
		
		b.checkBalance();
		System.out.println("----------");
		b.deposit(2000);
		b.checkBalance();
		System.out.println("----------");
		b.withdraw(1000);
		b.checkBalance();
		
		System.out.println("----------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to deposit");
		int amt= sc.nextInt();
		b.deposit(amt);
		b.checkBalance();
		
		System.out.println("-----------");
		
		System.out.println("Enter amount to withdraw");
		amt= sc.nextInt();
		b.withdraw(amt);
		b.checkBalance();
		
		sc.close();
	}

}

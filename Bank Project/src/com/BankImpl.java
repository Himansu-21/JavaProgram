package com;

class BankImpl implements Bank {
	
	int balance = 5000;

	@Override
	public void deposit(int amount) {
		System.out.println("Depositing ₹"+amount);
		balance += amount;
		System.out.println("Deposit Successful");
	}

	@Override
	public void withdraw(int amount) {
		System.out.println("Withdrawing ₹"+amount);
		balance -= amount;
		System.out.println("Withdraw successful");		
	}

	@Override
	public void checkBalance() {
		System.out.println("The Current Balance is "+balance);
		
	}

}

package com;

public class Payments {

//	 - method
//	   pay( upiId)
//	   pay( accNo,accName,pass)
//	   pay( cardNo, cvv, expDate)
	
	void pay(String upiid) {
		System.out.println("hello");
	}
	void pay(long accNo,String Name,String pass) {
		System.out.println("welcome");
	}
	void pay(long cardNo,int cvv,String expDate) {
		System.out.println("Payments");
	}
	public static void main(String[] args) {
		Payments p = new Payments();
		p.pay("8345693546@ybl");
		p.pay(20650100015659l,"Monoj","ask@234");
		p.pay(283838383838636l,343,"12/24");
	}
}

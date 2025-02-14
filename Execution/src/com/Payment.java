package com;

public class Payment {

	void pay(long accNo,String accUserName,String password)
	{
		System.out.println("Payment through internet banking");
	}
	
	void pay(String UpiId)
	{
		System.out.println("Payment through UPI ID");
	}
	
	void pay(long cardNum,int cvv,String expDate)
	{
		System.out.println("Payment through Debit Card");
	}
	
	public static void main(String[] args) {
		
		Payment p = new Payment();
		
		p.pay("Priyanshuparasar@sbi");
		
		p.pay(673460783931L, 398, "03/29");
		
		p.pay(9846280000602143L, "Priyanshu", "pa2sw0rd");
	}
}

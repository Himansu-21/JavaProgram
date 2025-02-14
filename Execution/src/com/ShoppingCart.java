package com;

public class ShoppingCart {
	
	void addProduct(String productName,int price)
	{
		System.out.println("Adding product : "+productName+" of price :"+price);
	}
	
	void addProduct(String productName,int price,int qty)
	{
		System.out.println("Adding product : "+productName+" of price :"+price+" and qty : "+qty);
	}
	
	public static void main(String[] args) {
		
		ShoppingCart s = new ShoppingCart();
		
		s.addProduct("Bicsuits", 100);
		
		s.addProduct("Noodles", 60, 2);
	}

}

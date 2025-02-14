package com;

public class ShoppingCart {
	void addProduct(String productName,int price){
		System.out.println("Welcome");
	}
	void addProduct(String productName,int price,int quantity) {
		System.out.println("Shopping");
	}

	public static void main(String[] args) {
		ShoppingCart a = new ShoppingCart();

		a.addProduct("Shoes",720);
		a.addProduct("FaceWash",500,2);
	}
}

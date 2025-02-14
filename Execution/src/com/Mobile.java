package com;

public class Mobile {
	
	int ram = 8;
	int storage = 128;
	String brand;
	int price;
	
	public Mobile(String brand,int price) {
		this.brand=brand;
		this.price=price;
	}
	
	public Mobile(String brand,int price,int storage) {
		this.brand=brand;
		this.price=price;
		this.storage=storage;
	}
	
	public Mobile(String brand,int price,int storage,int ram) {
		this.brand=brand;
		this.price=price;
		this.storage=storage;
		this.ram=ram;
	}
	
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile("Apple", 30000);
		
		Mobile m2 = new Mobile("Samsung", 35000,256);
		
		Mobile m3 = new Mobile("OnePlus", 80000, 512, 16);
		
		System.out.println("Brand : "+m1.brand);
		System.out.println("Price : "+m1.price);
		System.out.println("Ram : "+m1.ram+" GB");
		System.out.println("Storage : "+m1.storage+" GB");
		System.out.println("----------------------");
		
		System.out.println("Brand : "+m2.brand);
		System.out.println("Price : "+m2.price);
		System.out.println("Ram : "+m2.ram+" GB");
		System.out.println("Storage : "+m2.storage+" GB");
		System.out.println("----------------------");
		
		System.out.println("Brand : "+m3.brand);
		System.out.println("Price : "+m3.price);
		System.out.println("Ram : "+m3.ram+" GB");
		System.out.println("Storage : "+m3.storage+" GB");
		System.out.println("----------------------");
	}
	

}

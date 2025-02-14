package com;

public class Car {
	
	String color="Blue";
	int price;
	String brand;
	
	public Car(String brand,String color,int price) {
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	public Car(String brand,int price) {
		this.brand=brand;
		this.price=price;
	}
	
	public static void main(String[] args) {
		 
		Car c1 = new Car("Audi","Red",9800000);
		
		Car c2 = new Car("Mustang",7500000);
		
		System.out.println("Car Brand : "+c1.brand);
		System.out.println("Car Color : "+c1.color);
		System.out.println("Car Price : "+c1.price);
		System.out.println("------------------");
		
		System.out.println("Car brand : "+c2.brand);
		System.out.println("Car Color : "+c2.color);
		System.out.println("Car Price : "+c2.price);
		System.out.println("------------------");
	}

}

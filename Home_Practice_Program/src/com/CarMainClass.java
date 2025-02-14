package com;

public class CarMainClass {
	public static void main(String[] args) {
		Car c = new Car();
		//Static Variable
		System.out.println(c.color+" "+c.Price);
		c.drive();
		
		System.out.println("==========");
		//Non-Static Variable
		//System.out.println(name);// we can't access static variable directly in other class
		System.out.println(Car.name);
		//stop();//we can't access static method directly in other class
		Car.stop();
		
		
		
	}
}

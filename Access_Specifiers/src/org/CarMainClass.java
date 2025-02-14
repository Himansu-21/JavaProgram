package org;
//Accessing public member in different package.

import com.Car;

public class CarMainClass {
	public static void main(String[] args) {
		System.out.println("Car_brand:  "+Car.brand);

		Car c = new Car();

		System.out.println("Car_Cost:  "+c.cost);
	}
}

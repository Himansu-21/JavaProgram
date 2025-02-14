package com;

class MainRunner {
	
	
	//Upcasting or Generalization
	// Vehicle obj = new Car() or Vehicle obj = new Bike()
	static void driveVehicle(Vehicle obj) {
		
		if (obj instanceof Car) {
			Car car = (Car) obj;
			System.out.println("Brand: "+car.brand);
			car.drive();
		}
		else if (obj instanceof Bike) {
			Bike bike= (Bike) obj;
			System.out.println("Brand: "+bike.brand);
			bike.ride();
		}
	}
	
	public static void main(String[] args) {
		
		driveVehicle(new Car());
		System.out.println("------------");
		driveVehicle(new Bike());
	}
}

package com;

class Bike extends Vehicle{
	
	Bike() {
		super("honda"); // here explicitly calling the super class constructor
		System.out.println("In Bike");
	}
	
	public static void main(String[] args) {
		new Bike();
	}

}

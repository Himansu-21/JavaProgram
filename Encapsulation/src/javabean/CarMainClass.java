package javabean;

import java.util.Scanner;

public class CarMainClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Car c = new Car();
		
		System.out.println("Enter cost of car");
		int cost= sc.nextInt();
		
		c.setCost(cost);
		int carCost = c.getCost();
		
		System.out.println("Cost of the car is "+carCost);
		
//		System.out.println("Cost of the car is "+c.getCost());
		
		sc.close();
	}

}

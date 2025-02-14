package com;

import java.security.DomainCombiner;

public class Car {
	String Brand;
	double Price;
	String Color;

	Car(String Brand,double price ){
		this.Brand=Brand;
		this.Price=price;
	}
	Car(String Brand,String Color){
		this.Brand=Brand;
		this.Color=Color;
	}
	Car(String Brand,double Price ,String Color){
		this.Brand=Brand;
		this.Price=Price;
		this.Color=Color;
	}
		public static void main(String[] args) {
			Car c1 = new Car("HONDA",1600000);
			Car c2 = new Car("SUZUKI","Black");
			Car c3 = new Car("TATA",1850000);
			
		System.out.println("Car_Brand "+c1.Brand+"  Car_Price "+c1.Price+"  Car_Color "+c1.Color);
		System.out.println("Car_Brand "+c2.Brand+"  Car_Price "+c2.Price+"  Car_Color "+c2.Color);
		System.out.println("Car_Brand "+c3.Brand+"  Car_Price "+c3.Price+"  Car_Color "+c3.Color);
		}
}

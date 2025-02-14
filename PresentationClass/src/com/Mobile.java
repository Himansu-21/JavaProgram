package com;

public class Mobile {
		int price;
		int storage;
		String brand;
		
		Mobile(String brand,int price,int storage){
			this.brand=brand;
			this.price=price;
			this.storage=storage;
			
		}
		Mobile(String brand,int price ){
			this.brand=brand;
			this.price=price;
		}
		Mobile(String brand){
			this.brand=brand;
		
		}
		
		public static void main(String[] args) {
			Mobile m1 = new Mobile("Samsung",35000,4);
			Mobile m2 = new Mobile("Realme",20000);
			Mobile m3 = new Mobile("Poco");
			
		System.out.println("Mob_Brand "+m1.brand+"  Mob_Price "+m1.price+"  Mob_Color "+m1.storage);
		System.out.println("Mob_Brand "+m2.brand+"  Mob_Price "+m2.price+"  Mob_Color "+m2.storage);
		System.out.println("Mob_Brand "+m3.brand+"  Mob_Price "+m3.price+"  Mob_Color "+m3.storage);
		}
}

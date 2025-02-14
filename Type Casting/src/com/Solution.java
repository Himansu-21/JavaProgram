package com;

class Solution {

	static void display(Father obj) {

		// Generalization
		// Father obj = new Son()
		// Father obj = new Daugther()
		if(obj instanceof Son)
		{
			System.out.println("Downcasting to Son!!");
			Son son = (Son) obj; //Downcasting
			System.out.println(son.x+" "+son.y);
		}
		else {
			System.out.println("Downcasting to Daughter!!");
			Daughter daughter = (Daughter) obj; // Downcasting
			System.out.println(daughter.x+" "+daughter.z);
		}
	}

	public static void main(String[] args) {

		display(new Son());
		System.out.println("------------------");
		display(new Daughter());
	}
}

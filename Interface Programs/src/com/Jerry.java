package com;

class Jerry extends Person implements Hotel,Theater {

	//following contract of abstract
	//overriding the abstract methods

	@Override
	public void watchMovie(String name) {
		System.out.println("Jerry is watching "+name);
	}

	@Override
	public void orderFood(String name) {
		System.out.println("Jerry is ordering "+name);

	}

	@Override
	void eat() {
		System.out.println("Jerry is eating his food");

	}

	//Optionally we can override wal() from Person but not mandatory
	//as walk() is already a concrete method

	public static void main(String[] args) {

		Jerry j= new Jerry();

		j.orderFood("Burger & Pizza");
		j.watchMovie("Avengers");
		j.eat();
		j.walk();
	}

}

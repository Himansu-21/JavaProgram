package com;

class Tom extends Person{

	@Override
	void eat() {
		System.out.println("Tom is eating..");
	}
	
	public static void main(String[] args) {
		
		Tom t = new Tom();
//		Person p = new Person();
		// you can not make an object of abstract class
		
		t.eat();
	}

}

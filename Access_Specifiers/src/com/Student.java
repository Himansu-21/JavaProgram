package com;

// Accessing public members inside the same class.
public class Student {

	public static int age=20;
	public static String name = "Tom";
	//public String color = "blue";

	public void study() {
		System.out.println("Study Java!!");
	}

	public static void main(String[] args) {
		System.out.println("Age: "+Student.age);
		System.out.println("Name: "+Student.name);

		Student s = new Student();
		s.study();
		//System.out.println(s.color);
	}
}

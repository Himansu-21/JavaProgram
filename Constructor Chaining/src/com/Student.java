package com;

public class Student {
	
	public Student(int age) {
		System.out.println("Age: "+age);
	}
	
	public Student(String name){
		this(22);
		System.out.println("Name: "+name);
	}
	
	public Student(double height) {
		this("Alex");
		System.out.println("Height: "+height);
	}
	
	public static void main(String[] args) {
		
		new Student(5.7);
	}
}

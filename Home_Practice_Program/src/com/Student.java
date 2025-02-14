package com;

public class Student {
	final int id;
	String name;
	double perc;

	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public void play(int id,double perc) {
//		this.id = id;
//		this.perc = perc;
		System.out.println("Student playing: ");
		
	}
	
	public static void  read() {
		System.out.println("Student reading: ");
	}
	

public static void main(String[] args) {
		Student s1 = new Student(12,"Sumit");
		Student s2 = new Student(20,"Jit");
		
		System.out.println("Id:- "+s1.id+" Name:- "+s1.name+" "+" Id:- "+s2.id+" Name:- "+s2.name);
		
		s1.play(45,78.9);
		s2.play(32,90.87);
		
		Student.read();
	}

}

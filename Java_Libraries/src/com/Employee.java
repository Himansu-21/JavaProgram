package com;

public class Employee {
	
	int id;
	String name;
	
	Employee(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return (" Employee id -> " + id + "   Employee Name -> " + name );
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(2,"Akash");
		Employee e2 = new Employee(3,"Bikash");
		
		System.out.println(e1);
		System.out.println(e2);
	}
}

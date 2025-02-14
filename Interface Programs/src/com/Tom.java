package com;

public class Tom implements Employee{

	public static void main(String[] args) {
		
		System.out.println("Id: "+Employee.id);
		
		Tom t = new Tom();
		t.work();
	}

	@Override
	public void work() {
		
		System.out.println("Tom is working...");
		
	}
}

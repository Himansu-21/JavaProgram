package com;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Start");
		
		int[] a = {10,20,30,40};
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println("Denominator should not be zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Specified Index is not present");
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
		}
		
		System.out.println("------------------------------------");
		
		try {
			System.out.println(a[33]);
		}
		catch(Exception e) {
			System.out.println("Index not present");
		}
		System.out.println("End");
	}

}

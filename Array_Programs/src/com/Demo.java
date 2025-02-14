package com;

public class Demo {
	public static void main(String[] args) {

		//Array Declaration

		int [] a ;

		//Array Creation

		a = new int[4];

		//Printing Array Elements
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("Length " + a.length);
		
		System.out.println("-----------");

		//Array Initialization 

		a[0] = 10;
		a[1] = 50;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("-----------");
		
		//Array Declaration & Creation 
		double[] x = new double[3];
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println("Length " + x.length);
		System.out.println("-----------");
		
		x[0] = 1.2;
		x[1] = 2.4;
		
		System.out.println(x[1]);
		System.out.println(x[2]);
	}
}

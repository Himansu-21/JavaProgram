package com;

import java.util.Scanner;

public class Array_Name_Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int ar = sc.nextInt();
		
		System.out.println("Enter the element");
		String [] name = new String[ar];
		
		for(int i=0;i<name.length;i++) {
			name[i] = sc.next();
			System.out.println(name[i]);
		}
		System.out.println("----------------");
		for(int j=0;j<name.length;j++) {
			System.out.println(name[j]+" "+j);
		}
		
	}

}

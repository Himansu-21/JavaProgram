package com;

import java.util.Scanner;

public class N_Char_Value {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int ar = sc.nextInt(); 
		
		System.out.println("Enter the Character");
		char [] name = new char[ar];	
		
		for(int i=0;i<name.length;i++) {
			name[i]=sc.next().charAt(0);
		}
	}

}

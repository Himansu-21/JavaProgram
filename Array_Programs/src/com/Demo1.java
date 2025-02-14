package com;

public class Demo1 {
	public static void main(String[] args) {
		int[] a = {10,20,30};
		// print array value in decending order
		for(int i= a.length-1;i>=0;i--){
			System.out.println(i);
			System.out.println(a[i]);
		}

		String[] subjects = {"java","c","C++","Python"};
		for(int i = subjects.length-1;i>=0;i--) {

			System.out.println(subjects[i]);
		}
	}
}

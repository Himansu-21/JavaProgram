package com;

import java.io.FileReader;

public class FileExample {

	//Checked Exception
	void read() {
		try {
			FileReader r = new FileReader("Open.txt");
		}catch(Exception e) {
			System.out.println("File is not Present");
		}
	}
	//Unchecked Exception
	void divide() {
		System.out.println(10/0);
	}

	public static void main(String[] args) {
		FileExample f = new FileExample();
		f.read();

		try {
			f.divide();
		} catch(ArithmeticException e){
			System.out.println("Not found");
		}

	}
}
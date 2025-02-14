//package org;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//
//public class FileDemo {
//	
//	static void read() throws FileNotFoundException,ArithmeticException{
//		
//		FileReader f = new FileReader("open.txt");
//		//System.out.println(10/0);
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("Start");
//		
//		try {
//			FileDemo.read();
//		}
//		catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("End");
//	}
//}

package comm;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Solution1 {
	
	static void run() throws FileNotFoundException{
		FileReader fr = new FileReader("Text.txt");
	}
	
	static void exec() throws ArithmeticException{
		System.out.println(10/0);
	}
		

	
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			run();
		}catch(Exception e) {//Exception e = new FileNotFoundException();
			System.out.println(e.getMessage());
		}
		try {
			exec();
		} catch(Exception e) { //Exception e = new ArithmeticException();
			System.out.println(e.getMessage());
		}
			
		System.out.println("End");
	}

}

package org;

import java.io.FileNotFoundException;

public class RunnerImpl {
	public static void main(String[] args) {
		System.out.println("Start");
		
		try {
		FileDemo.read();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		System.out.println("End");
	}

}

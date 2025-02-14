package comm;

import java.util.Scanner;

public class MatrimonyPortal {
	static void validateAge(int age) throws InvalidAgeException{
		if(age>21) {
			System.out.println("Get Married Soon!");
		}else {
			throw new InvalidAgeException("Invalid Age");
		}
	}

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		scan.close();
		
		try {
			validateAge(age);
		}catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
	
}

package example;

import java.util.Scanner;

class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter Choice:");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Hi");
				break;
			case 2:
				System.out.println("Bye");
				break;
			case 3:
				System.out.println("Thank You!");
				sc.close();
				System.exit(0); // terminates JVM/Program
				
			default:
				System.out.println("Invalid Choice");
			} // end od switch
			
			System.out.println("---------------");
		} // end of while loop
		
	} // ends of main()

} // end of class

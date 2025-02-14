package operator;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int a =sc.nextInt();
		
		System.out.println((a>9 && a<100) ||(a<-9 && a>-100)? a+" is a 2 digit number":a+" is Not a 2 digit number");
		sc.close();
	}
}

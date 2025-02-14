package operator;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st character");
		char ch1=sc.next().charAt(0);
		
		System.out.println("Enter 2nd character");
		char ch2=sc.next().charAt(0);
		
		System.out.println(ch1<ch2 & ch2==ch1);
		
		sc.close();
	}
}

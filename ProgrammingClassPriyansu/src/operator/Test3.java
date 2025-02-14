package operator;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number :");
		int a =sc.nextInt();

		System.out.println("Enter 2nd number :");
		int b =sc.nextInt();
		
		System.out.println(a==b?"values are equal "+a:(a>b?a+" is largest":b+" is largest"));
		
		sc.close();
	}
}

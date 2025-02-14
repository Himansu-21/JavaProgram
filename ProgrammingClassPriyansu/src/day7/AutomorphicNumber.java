package day7;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num = sc.nextInt();

		boolean res = isAutomorphicNumber(num);

		if (res)
			System.out.println("It is Automorphic Number");
		else
			System.out.println("It is Not Automorphic Number");

		sc.close();
	}
	
	public static boolean isAutomorphicNumber(int n) {
		
		boolean flag = true;
		int square = n * n;

		for (; n != 0; n /= 10, square = square / 10) {

			if (n % 10 != square % 10) {
				flag = false;
				break;
			}
		}
		
		return flag;

	}

}

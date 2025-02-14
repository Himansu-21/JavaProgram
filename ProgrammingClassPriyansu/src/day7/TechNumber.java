package day7;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		int num = isTechNumber(n);

		if (num == n)
			System.out.println("It is a Tech Number");
		else
			System.out.println("It is Not Tech Number");

		sc.close();
	}

	public static int isTechNumber(int n) {

		int count = 0;

		for (int num = n; num != 0; num /= 10)
			count++;

		if (count % 2 == 0) {
			int prod = 10;
			for (int i = 1; i < count / 2; i++)
				prod *= 10;

			int firstHalf = n / prod;
			int lastHalf = n % prod;

			int sum = firstHalf + lastHalf;

			int num = sum * sum;

			return num;

		} else
			return -1;
	}
}

package pattern.day11;

import java.util.Scanner;

class Pattern13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * n - 1; j++) {

				if (i<=j && j-i<=n-1)
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");

			}
			System.out.println();
		}
		sc.close();
	}
}

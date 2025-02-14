package operators;

import java.util.Scanner;

public class LogicalOperator4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number:");
		int a = sc.nextInt();

		System.out.println(a>9 && a<100 || (a<-9 && a>-100)? "a is two digit number" : "a is not two digit number");
		sc.close();
	}
}

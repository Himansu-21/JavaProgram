package operators;

import java.util.Scanner;

public class LogicalOperator5 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int count = 0;
		while(n!=0) {
			int digit = n%10;
				count++;
				n=n/10;
		}
		System.out.println(count);
		
		}
}

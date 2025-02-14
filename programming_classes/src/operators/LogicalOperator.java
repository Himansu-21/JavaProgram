package operators;


import java.util.Scanner;
public class LogicalOperator {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number: ");
			int a = sc.nextInt();
			System.out.println("Enter the first number: ");
			int b = sc.nextInt();
			
			System.out.println(a==b && a>=b);
			System.out.println(a!=b && a<=b);
			//System.out.println(++a);
			
			
		}
}

package programming;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value :");
		
		int n = sc.nextInt();
		
		int prod =1;
		
		while(n!=0)
		{
			int digit = n%10;
			prod=prod*digit;
			n = n/10;
		}
		
		System.out.println("Product of digits : "+prod);
		
		sc.close();
	}
}

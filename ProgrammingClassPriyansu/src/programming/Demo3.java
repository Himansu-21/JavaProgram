package programming;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value :");
		
		int n = sc.nextInt();
		
		int sum =0;
		
		while(n!=0)
		{
			int digit = n%10;
			sum=sum+digit;
			n = n/10;
		}
		
		System.out.println("Sum of digits : "+sum);
		
		sc.close();
	}
}

package operator;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a= sc.nextInt();
		
		int count =0;
		
		while(a!=0)
		{
			a=a/10;
			count++;
		}
		
		System.out.println("count of digits in number is "+count);
		
		sc.close();
	}
}

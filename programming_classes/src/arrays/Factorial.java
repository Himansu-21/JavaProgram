package arrays;

import java.util.Scanner;

public class Factorial {
	
		
	public static void main(String[] args) {
//		int [] ar = {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int [] ar = new int[size]; 
		
		System.out.println("enter the array element:");
		//to take dynamic value from the user
		for(int i=0;i<ar.length;i++) {
			ar[i] =sc.nextInt();
		}
		
		for(int i=0;i<ar.length;i++) 
		{
			int result = isFactorial(ar[i]);
			System.out.println(ar[i]+"---->"+result);
		}
	}
	
	//to find factorial using method
	public static int isFactorial(int n) {
		
		int fact = 1;
		
		for(int j=1;j<=n;j++) 
		{
			fact = fact*j;
		}
		return fact;
	}
}


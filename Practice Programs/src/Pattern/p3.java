package Pattern;

import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		int n = sc.nextInt();
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=2*n-1;j++) {
		
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=n;j++) {
//				if(i<=j && i+j<=2*n)
				if(i>=j && i+j<=2*n)
				{
					System.out.print("*  ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
	}
}

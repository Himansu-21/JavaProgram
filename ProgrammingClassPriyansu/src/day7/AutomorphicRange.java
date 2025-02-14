package day7;

import java.util.Scanner;

public class AutomorphicRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			boolean flag = AutomorphicNumber.isAutomorphicNumber(i);
			
			if(flag)
				System.out.println(i);
		}
		
		sc.close();
	}
}

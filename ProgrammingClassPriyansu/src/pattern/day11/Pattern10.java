package pattern.day11;

import java.util.Scanner;

class Pattern10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		
		for(int i=1;i<=2*n-1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				// ternary operator can be used to optimise this code
				if(i+j>=n+1 && i-j<=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		sc.close();
		
	}
}

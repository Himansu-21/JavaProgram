package pattern.day13;

import java.util.Scanner;

class PatternAssignment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();

		for(int i=1;i<=2*n-1;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
				if((i+j>=2*n && i<=n) || (i+j<=2*n && i>=n) )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		sc.close();
	}	
}

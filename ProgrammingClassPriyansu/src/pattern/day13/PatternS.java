package pattern.day13;

import java.util.Scanner;

class PatternS {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();

		for(int i=1;i<=2*n-1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( i==1 || i==2*n-1 || i==n || ((j==1 || j==n) && i-j<n && i-j>0) )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		sc.close();
	}

}

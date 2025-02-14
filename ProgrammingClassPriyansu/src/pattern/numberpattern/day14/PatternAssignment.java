package pattern.numberpattern.day14;

import java.util.Scanner;

class PatternAssignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int a =0;  // if post increment a=1;
			for(int j=1;j<=2*n-1;j++)
			{
				// j<n ? a++ : a--   // here 'j<=n' will not be used as it will increment when not needed i.e after the n th row.
				if(i+j>=n+1 && j-i<=n-1)
					System.out.print(j<=n?++a:--a); 
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}

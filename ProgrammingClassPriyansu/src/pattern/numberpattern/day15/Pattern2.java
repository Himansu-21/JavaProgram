package pattern.numberpattern.day15;

import java.util.Scanner;

class Pattern2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++)
		{
			int a =i;
			for(int j=1;j<=2*n-1;j++)
			{
				if(i+j>=n+1 && j-i<=n-1)
					System.out.print(j<n ? a--+" ":a+++" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

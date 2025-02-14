package pattern.numberpattern.day16;

import java.util.Scanner;

class Pattern3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n val:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int a =n-i+1;
			for(int j=1;j<=2*n-1;j++)
			{
				if(i<=j && i+j<=2*n)
					if(j<n)
						System.out.print(a--+" ");
					else
						System.out.print(a+++" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}

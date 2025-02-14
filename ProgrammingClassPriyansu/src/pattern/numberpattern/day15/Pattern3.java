package pattern.numberpattern.day15;

import java.util.Scanner;

class Pattern3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++)
		{
			int a =n;
			for(int j=1;j<=2*n-1;j++)
			{
				if(i+j>=n+1 && j-i<=n-1)
					if(j<n)
						System.out.print(a-- +" ");
					else
						System.out.print(a++ +" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}

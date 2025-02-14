package pattern.day11;

import java.util.Scanner;

class Pattern11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
				if (i-j>=0 || i+j>=2*n)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}

package pattern.numberpattern.day17;

import java.util.Scanner;

class Pattern4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n val");
		int n = sc.nextInt();
		
		for(int i=1;i<=2*n-1;i++)
		{
			int a =1;
			for(int j=1;j<=2*n-1;j++)
			{
				if( (i<=j && i+j<=2*n) || (i>=j && i+j>=2*n) )
					System.out.print(a++ +" ");
				else
					System.out.print("  ");
 			}
			System.out.println();
		}
		sc.close();
	}

}

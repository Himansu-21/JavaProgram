package pattern.numberpattern.day13;

import java.util.Scanner;


//1         
//1 2       
//1 2 3     
//1 2 3 4   
//1 2 3 4 5 

class Pattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			int a=1;
			for(int j=1;j<=n;j++)
			{
				if( i>=j )
					System.out.print(a++ +" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		sc.close();
	}
}

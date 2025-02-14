package pattern.numberpattern.day14;

import java.util.Scanner;


//        1 
//      1 0 
//    1 0 1 
//  1 0 1 0 
//1 0 1 0 1 


class Pattern5 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			int a =1;
			for(int j=1;j<=n;j++)
			{
				if( i+j>=n+1 ) {
					System.out.print(a%2+" ");
					a++;
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		sc.close();
	}

}

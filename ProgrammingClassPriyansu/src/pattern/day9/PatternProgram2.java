package pattern.day9;

import java.util.Scanner;

class PatternProgram2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N for matrix size");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j =1;j<=n;j++)
			{
				if(j==2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		sc.close();
	}

}

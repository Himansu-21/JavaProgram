package pattern.day10;

import java.util.Scanner;

public class PatternProgram4 {

public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n val");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
				if(i+j<=2*n && i<=j)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

package pattern.day9;

import java.util.Scanner;

class PatternProgram9 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n val");
		int n= sc.nextInt();
		
		for(int i = 1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}

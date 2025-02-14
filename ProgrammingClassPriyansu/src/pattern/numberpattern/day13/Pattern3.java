package pattern.numberpattern.day13;

import java.util.Scanner;


//A         
//A B       
//A B C     
//A B C D   
//A B C D E 

class Pattern3 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			char ch = 'A';
			for(int j=1;j<=n;j++)
			{
				if( i>=j )
					System.out.print(ch++ +" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		sc.close();
	}

}

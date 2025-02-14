package pattern.numberpattern.day14;

import java.util.Scanner;

//    1    
//   123   
//  12345  
// 1234567 
//123456789

class Pattern6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int a=1;
			for(int j=1;j<=2*n-1;j++)
			{
				if(i+j>=n+1 && j-i<=n-1)
					System.out.print(a++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}

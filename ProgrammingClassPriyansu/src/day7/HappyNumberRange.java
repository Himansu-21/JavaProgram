package day7;

import java.util.Scanner;

public class HappyNumberRange {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int res = HappyNumber.isHappyNumber(i);
			
			if(res==1)
				System.out.println(i);
		}
		
		sc.close();
	}

}

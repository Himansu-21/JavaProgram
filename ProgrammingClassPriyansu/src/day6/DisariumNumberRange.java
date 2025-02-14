package day6;

import java.util.Scanner;

public class DisariumNumberRange {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			boolean flag = DisariumNumber.isDisariumNumber(i);
			
			if(flag)
				System.out.println(i);
		}
		
		sc.close();
	}

}

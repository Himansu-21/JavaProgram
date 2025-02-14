package day7;

import java.util.Scanner;

public class TechNumberRange {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter range:");
		int n=sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int num = TechNumber.isTechNumber(i);
			
			if(num==i)
				System.out.println(i);
		}
		
		sc.close();
	}

}

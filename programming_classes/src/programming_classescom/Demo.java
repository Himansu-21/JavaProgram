//write a java program to find the sum of first 'n' number

package programming_classescom;

import java.util.Scanner;


public class Demo {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n value");
		
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1;i<=n;i++) 
		{
			
			sum = sum+i;
		}
		
		System.out.println(sum);

	}
	
}

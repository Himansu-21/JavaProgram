//write a java program to print the number n to 1

package programming_classescom;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		
		for(int i=n;i>=1;i--) {
			
			System.out.println(i);
		}
		
		sc.close();
	}

}

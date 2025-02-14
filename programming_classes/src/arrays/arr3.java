package arrays;

import java.util.Scanner;

public class arr3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		System.out.println("Enter the array elements");
		String[] s = new String[size];

		
		//to take names from the user dynamically
		for(int i=0;i<s.length;i++) 
		{
			s[i] = sc.next();
			//s[i] = sc.nextLine();
			
		}
		
		//to print the data using loops
		System.out.println("--------------");
 
		for(int j= 0;j<s.length;j++)
		{
			System.out.println(s[j]);
		}
	}

}

package arrays;

import java.util.Scanner;

public class characterInFirstName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		//String array
		String[] str = new String[size];
		
		//to take names
		for(int i=0;i<str.length;i++)
		{
			str[i] = sc.next();
		}
		
		//to extract first character from the name
		
		for(int j=0;j<str.length;j++)
		{
			System.out.println(str[j].charAt(0));
			 System.out.println();
		}
		
		
	}

}




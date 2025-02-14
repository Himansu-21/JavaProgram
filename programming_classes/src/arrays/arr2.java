package arrays;

import java.util.Scanner;

public class arr2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Names");
		String [] s = new String[3];

		for(int i=0;i<s.length;i++) 
		{
			s[i] = sc.next();
			//s[i] = sc.nextLine();
			
		}

		System.out.println("--------------");
 
		for(int j= 0;j<s.length;j++)
		{
			System.out.println(s[j]);
		}
	}

}

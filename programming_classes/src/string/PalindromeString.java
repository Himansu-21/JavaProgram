package string;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1= sc.nextLine();

		int i=0;
		int j=s1.length()-1;
		boolean flag = false;
		while(i<=j)
		{
			if(s1.charAt(i)==s1.charAt(j)) {
				i++;
				j--;
			}else {
				flag = true;
				break;
			}
		}
		if(flag==true)
			System.out.println("It is not a palindrome String");
		else
			System.out.println("It is a palindrome String");

	}

}

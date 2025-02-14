package string;

import java.util.Scanner;

public class Compare2String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1= sc.nextLine();
		String s2=sc.nextLine();
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		boolean flag = false;
		
		for(int i=0;i<ch1.length;i++) {
			
			if(ch1[i]!=ch2[i]) {
				flag=true;
				break;
			}
		}
		
		if(flag==true) 
			System.out.println("not equal");
		else 
			System.out.println("equal");
	}

}

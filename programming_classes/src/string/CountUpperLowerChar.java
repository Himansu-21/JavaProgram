package string;

import java.util.Scanner;

public class CountUpperLowerChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		//String str = "Welcome To JSpiders";
		char[] ch = str.toCharArray();
		int ucc =0;
		int lcc=0;
	for(int i=0;i<ch.length;i++) {
		if(ch[i]>='A'&&ch[i]<='Z') {
			ucc++;
		}
		else if(ch[i]>='a'&&ch[i]<='z') {
			lcc++;
		}
		
	}
	System.out.println("Upper case char is :"+ucc);
	System.out.println("lower case char is :"+lcc);
	}
}

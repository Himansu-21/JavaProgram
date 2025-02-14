package string;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		
		//using toChar Array()
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			ch[i]=str.charAt(str.length()-1-i);
		}
		str=new String(ch);
		System.out.println(str);
		
		System.out.println("----------------------------");

		//using charAt()
		String s1="";
		for(int i = str.length()-1;i>=0;i--) {
			s1 = s1+str.charAt(i);
		}
		System.out.println(s1);
	}
}

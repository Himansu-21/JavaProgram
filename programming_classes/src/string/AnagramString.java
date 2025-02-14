package string;

import java.util.Scanner;

public class AnagramString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s1= sc.nextLine();
		String s2= sc.nextLine();
		boolean result=isAnagram(s1,s2);
		if(result==true)
			System.out.println("Strings are anagram");
		else
			System.out.println("String are not anagram");
}	
	public static boolean isAnagram(String s1,String s2) {
		int[] c1=countFrequency(s1);
		int[] c2=countFrequency(s2);

		for(int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}

	public static int[] countFrequency(String str) {

		int[] count=new int[26];//Holding the address of the array 

		for(int i =0;i<str.length();i++) {

				char ch1=str.charAt(i);

				if(ch1>='A' && ch1<='Z')
					count[ch1-65]++;
				else if(ch1>='a' && ch1<='z')
				count[ch1-97]++;
		}
		return count;
	
	}
}



	
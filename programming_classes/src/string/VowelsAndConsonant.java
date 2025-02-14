package string;

import java.util.Scanner;

public class VowelsAndConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.nextLine();//String be in Lower Case
		
		int vc=0,cc=0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)>='a' && str.charAt(i)<='z'||str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
						||str.charAt(i)=='o'||str.charAt(i)=='u'|| //--->Lowercase Vowels
						 str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'
						||str.charAt(i)=='O'||str.charAt(i)=='U')  //--->Uppercase Vowels
				{
					vc++;
				}
				else
					cc++;
			}
		}
		
		System.out.println("Vowel Count: "+vc);
		System.out.println("Consonants count: "+cc);
	}

}

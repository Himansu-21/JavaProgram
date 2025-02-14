package string;

import java.util.Scanner;

public class CountUpperLowewrDigitSpecial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str= sc.nextLine();
//		String str = "Welcome To JSpiders 560004 @!";
		int ucc=0;
		int lcc=0;
		int dc=0;
		int scc=0;
		int space=0;
		
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				ucc++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
				lcc++;
			}
			else if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
				dc++;
				}
			else if(str.charAt(i)==' ') {
				space++;
			}
			else {
				scc++;
			}
	}
		System.out.println("Upper case count:\t\t"+ucc);
		System.out.println("lower case count:\t\t"+lcc);
		System.out.println("Digit count:\t\t"+dc);
		System.out.println("Space count:\t\t"+space);
		System.out.println("Special Character Count:\t\t"+scc);

}
}
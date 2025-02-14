package string;

public class UpperAndLowerCaseCharacter {
	public static void main(String[] args) {
		String str = "Welcome To JSpider";
		int ucc =0;//UpperCase
		int lcc=0;//LowerCase
		int space=0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				ucc++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
				lcc++;
			}
			else if(str.charAt(i)==' ') {
				space++;
			}
		}
		System.out.println("Upper case char is :"+ucc);
		System.out.println("lower case char is :"+lcc);
		System.out.println("Space is :"+space);
	}

}
 
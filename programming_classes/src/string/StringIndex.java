package string;

public class StringIndex {
	public static void main(String[] args) {
		String str = "program";
		//using charAt();
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i)+"-->"+i);
		}
		
		System.out.println("-------------OR---------------");
		
		char[] ch = str.toCharArray();
		//using toCharArray();
		for(int i = 0;i<ch.length;i++) {
			System.out.println(ch[i]+"-->"+i);
		}
	}
	
}

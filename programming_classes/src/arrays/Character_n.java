package arrays;
//take n character input from user and print them
import java.util.Scanner;

public class Character_n {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		char[] ch=new char[size];
		
		//to take dynamic data from user
		
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		
		System.out.println("--------------");
		
		//for printing the characters
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}

}

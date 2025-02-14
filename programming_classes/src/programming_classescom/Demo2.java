//write a java program to access each digit present in number

package programming_classescom;
import java.util.Scanner;
public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		while(n!=0) {
			
			int digit = n%10;
			System.out.println(digit);
			n=n/10;
		}
	sc.close();
	}
	

}

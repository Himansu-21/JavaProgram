//write a java program to print sum of digit in number

package programming_classescom;
import java.util.Scanner;
public class Demo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		int sum =0;
		while(n!=0) 
		{
			
			int digit = n%10;
			sum = sum+digit;
			n=n/10;
		}
		System.out.println("sum is: " + sum);
		sc.close();
	}


}

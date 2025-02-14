//write a java program to print product of given in number

package programming_classescom;
import java.util.Scanner;
public class Demo4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		int product=1;
		while(n!=0) 
		{

			int digit = n%10;
			product = product*digit;
			n=n/10;
		}
		System.out.println("sum is: " + product);
		sc.close();
	}


}

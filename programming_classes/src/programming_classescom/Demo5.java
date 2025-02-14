//write a java program to print product of given in number

package programming_classescom;
import java.util.Scanner;
public class Demo5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		int product=1;
		int sum=0;
		while(n!=0) 
		{
			int digit = n%10;
			sum=sum+digit;
			product = product*digit;
			n=n/10;
		}
		if(sum==product)
			System.out.println("it is spy number");
		else 
			System.out.println("not spy number");
		sc.close();
	}


}

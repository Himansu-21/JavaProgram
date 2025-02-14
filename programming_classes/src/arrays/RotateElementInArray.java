package arrays;

import java.util.Scanner;

//Rotate right element in Array
public class RotateElementInArray {
	public static void main(String[] args) {
		int [] ar = ArrayOperations.readarray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no operations");
		int n = sc.nextInt();
		//int count =0;
		if(n%ar.length==0)
			ArrayOperations.display(ar);
		while(n!=0)
		{
			int temp = ar[ar.length-1];
			for(int i = ar.length-1;i>0;i--)
			{
				ar[i]=ar[i-1];
			}
			//count++;
			ar[0] = temp;
			n--;
		}
		//System.out.println(count);
		ArrayOperations.display(ar);
	}

}

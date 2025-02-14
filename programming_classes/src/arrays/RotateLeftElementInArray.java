package arrays;

import java.util.Scanner;

//Rotate right element in Array
public class RotateLeftElementInArray {
	public static void main(String[] args) {
		int [] ar = ArrayOperations.readarray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no operations");
		int n = sc.nextInt();
	
		while(n!=0)
		{
			int temp = ar[0];
			for(int i=1;i<ar.length;i++)
			{
				ar[i-1]=ar[i];
			}
			
			ar[ar.length-1] = temp;
			n--;
		}
	
		ArrayOperations.display(ar);
	}

}

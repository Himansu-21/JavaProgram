package arrays;

import java.util.Scanner;

public class RemoveAnElementArrays {
	public static void main(String[] args) {
		int[] ar = ArrayOperations.readarray();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the position");
		int pos = sc.nextInt();

		pos=pos-1;
		int j=pos-1;
		
		while(j<ar.length-1)
		{
			ar[j] = ar[j+1];
			j++;
		}
		ar[j] = 0;
		
		ArrayOperations.display(ar);
	}	
	
}

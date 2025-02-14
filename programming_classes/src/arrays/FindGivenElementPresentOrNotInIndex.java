package arrays;

import java.util.Scanner;

public class FindGivenElementPresentOrNotInIndex {
	public static void main(String[] args) {
		
		int [] ar = ArrayOperations.readarray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no operations");
		int n = sc.nextInt();
		
		boolean flag=false;
		for(int i =0;i<ar.length;i++) {
			if(ar[i]==n)
			{
				flag=true;
				System.out.println("Element found at index: "+i);
				break;
			}
		}
		if(flag==false)
			System.out.println("Element not found");
	}

}

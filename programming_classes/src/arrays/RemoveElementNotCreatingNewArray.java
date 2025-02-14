package arrays;

import java.util.Scanner;

public class RemoveElementNotCreatingNewArray {
	public static void main(String[] args) {
		int[] ar = ArrayOperations.readarray();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index");
		int index = sc.nextInt();
//		System.out.println("Enter the element");
//		int ele = sc.nextInt();
		isRemoveElement(ar,index);
		
	}
	
	public static void isRemoveElement(int[] ar,int index)
	{
		int j=index;
		
		while(j<ar.length-1)
		
		{
			ar[j] =ar[j+1];
			j++;
		}
		ar[j] = 0;
		
		ArrayOperations.display(ar);
	}
	

}

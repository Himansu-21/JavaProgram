package arrays;

import java.util.Scanner;

public class InsertElementNotCreatingNewArray {
	public static void main(String[] args) {
		int[] ar = ArrayOperations.readarray();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index");
		int index = sc.nextInt();
		System.out.println("Enter the element");
		int ele = sc.nextInt();
		isInsertElement(ar,index,ele);
//		isInsert(ar,index,ele);
		
	}
	
	public static void isInsertElement(int[] ar,int index,int ele)
	{
		int j=ar.length-2;
		
		while(j>=index)
		
		{
			ar[j+1] = ar[j];
			j--;
		}
		ar[index] = ele;
		
		ArrayOperations.display(ar);
	}
	
	
//	public static void isInsert(int[] ar,int index,int ele)
//	{
//
//		int j=ar.length-1;
//
//		while(j>index)
//		{
//			ar[j] = ar[j-1];
//			j--;
//		}
//		ar[index] = ele;
//		
//		ArrayOperations.display(ar);
//	}

}

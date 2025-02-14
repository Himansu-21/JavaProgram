package arrays;

import java.util.Scanner;

public class InsertAnElementInArray {
	public static void main(String[] args) {
	//	int[] ar = ArrayOperations.readarray();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		// to create an array of size +1
		int [] ar = new int[size+1];
		
		//to store an elements
		for(int i = 0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter the position");
		int pos = sc.nextInt();
		System.out.println("Enter the element");
		int ele = sc.nextInt();
		InsertElement(ar,pos,ele);
	}

	
	public static void InsertElement(int[] ar, int pos, int ele) 
	{
		int j=ar.length-1;
		
		while(j>=pos)
		
		{
			ar[j] = ar[j-1];
			j--;
		}
		ar[j] = ele;
		
		ArrayOperations.display(ar);
	}
	
		
	
}

package arrays;

import java.util.Scanner;

public class InsertAnElement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] ar = ArrayOperations.readarray();//Another class
			
		System.out.println("Enter the index where you want to insert element");
		int index = sc.nextInt();
		
		System.out.println("Enter the element to be inserted");
		int ele = sc.nextInt();
		isInsert(ar,index,ele);
		
	}
	
	public static void isInsert(int[] ar, int index, int ele) {
		//new array
		int[] br = new int[ar.length+1];
		
		if(index < 0 || index > ar.length)
		{
			System.out.println("index invalid");
		}
		else
		{
			br[index] = ele;
			
			for(int i = 0;i<ar.length;i++) {
				if(i<index)
					br[i] = ar[i];
				else
					br[i+1] = ar[i];
			}
			ArrayOperations.display(br);
		}
	}
}

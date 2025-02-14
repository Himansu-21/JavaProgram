package arrays;

import java.util.Scanner;

public class OddIndexElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		
		int[] ar = new int[size];
		
		//to take the n integer values from user
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}

		System.out.println("---------------------");
		
		//to print only odd index element in array
		for(int j=0;j<ar.length;j++)
		{
			if(j%2==1)
			{
			System.out.println(ar[j]);
			}
			
		}
	}

}

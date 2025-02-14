package arrays;

import java.util.Scanner;

public class SumOfEvenElements {
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

		//to print only even element in array
		for(int j=0;j<ar.length;j++)
		{
			if(ar[j]%2==0)
			{
				sum=sum+ar[j];
				
			}
			
		}
		System.out.println("Sum of number is "+sum);
	}

}

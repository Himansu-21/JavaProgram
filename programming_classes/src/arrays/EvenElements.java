package arrays;

import java.util.Scanner;

public class EvenElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int size = sc.nextInt();

		int[] ar=new int[size];
		//to take dynamic data from user

		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}

		//for printing the characters

		for(int j=0;j<ar.length;j++)
		{
			if(ar[j]%2==0){
				System.out.println(ar[j]);	
			}

		}
	}
}

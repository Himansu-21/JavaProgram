package arrays;

import java.util.Scanner;

class ProgramNames {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// get the size of the array
		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		
		String[] names = new String[size];
		
		// get the array elements
		System.out.println("Enter array elements");
		
		for(int i=0;i<names.length;i++)
			names[i]=sc.next();
		
		System.out.println("---------------");
		
		// print the array elements
		for(int i=0;i<names.length;i++)
			System.out.println("index: "+i+" Value: "+names[i]);
		
		sc.close();
	}

}

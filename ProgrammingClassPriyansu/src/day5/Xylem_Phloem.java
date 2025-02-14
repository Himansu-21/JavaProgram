package day5;

import java.util.Scanner;

public class Xylem_Phloem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();

		int tmp = n;

		int sumMeans=0;
		int sumExtreme = 0;

		while(tmp!=0)
		{
			int digit = tmp%10;
			tmp=tmp/10;

			if(tmp==n/10 || tmp==0)
			{
				sumExtreme+=digit;
			}
			else
			{
				sumMeans+=digit;
			}
		}

		if(sumMeans==sumExtreme)
			System.out.println("Xylem Number");
		else
			System.out.println("Phloem Number");

		sc.close();

	}
}

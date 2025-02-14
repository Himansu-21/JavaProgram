package com;
//It is a positive integer to sum odf factorial of each digit is equal to the original number such number are called STRONG number

import java.util.Scanner;

public class StrongNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int temp =n;
        int sum =0;
        while(n!=0)
        {
            int digit =n%10;
            int fact = 1;
            for(int i = 1;i<=digit;i++)
            {
                fact = fact*i;
            }
            sum = sum+fact;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not  a strong number");
        }
    }
}

package com;

import java.util.Scanner;

//factorial of a given number
public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int product =1;
        for(int i =1; i<=n; i++){
            product = product*i;

        }
        System.out.println(product);
    }
}

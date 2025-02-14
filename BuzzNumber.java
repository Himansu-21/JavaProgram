package com;

import java.util.Scanner;
//if the number either ends with 7 or multiple of 7 such numbers are called buzz number
public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int a = sc.nextInt();

        if(a%10==7 || a%7==0){
            System.out.println(a+"It is a buzz number");
        }
        else{
            System.out.println(a+"It is not a buzz number");
        }
    }
}

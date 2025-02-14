package com;

import java.util.Scanner;

//WAJP the given number is neon number or not
//if a square of a number and the sum of each digit ...if equal to the original number such number are called neon number
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a = sc.nextInt();

        int sq = a*a;
        int x = sq%10;
        int y = sq/10;
        if((x+y)==a){
            System.out.println("neon number");
        }
        else{
            System.out.println("Not neon number");
        }




    }
}

package com.company;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        System.out.println("Enter a year:");
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        int Result=year%4;
        int zero= 0;
        if (Result==zero){
            System.out.println("Yes! It is a Leap year.");
        }
        else {
            System.out.println("It is not a Leap year");
        }
    }
}

package com.company;
import java.util.Scanner;
public class Income_Tax {
    public static void main(String[] args) {
     Float Income;
        System.out.println("Enter your Income");
     Scanner sc = new Scanner(System.in);
     Income = sc.nextFloat();
     Float Tax1 = ((Income*30)/100);
     Float Tax2 = ((Income*20)/100);
     Float Tax3 = ((Income*5)/100);
        System.out.println("Tax paid by you is: ");

        if (Income >=250000 ) {
            System.out.println(Tax3);
        }
        else if (Income>=500000) {
            System.out.println(Tax2);
        }
        else if (Income>=1000000){
            System.out.println(Tax1);
        }
        else {
            System.out.println("0");
        }
        }


    }

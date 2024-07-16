package com.company;
import java.util.Scanner;

public class Taking_Input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding sum of Integers");
        System.out.println("Enter Number 1");
        int a= sc.nextInt();
        System.out.println("Enter Number 2");
        int b= sc.nextInt();
        int Sum= a+b;
        System.out.println("The value of Sum is: ");
        System.out.println(Sum);
        System.out.println("Finding sum of Decimal Numbers");
        System.out.println("Enter Number 1");
        Float c= sc.nextFloat();
        System.out.println("Enter Number 2");
        Float d= sc.nextFloat();
        Float Sum2= c+d;
        System.out.println("The value of Sum2 is: ");
        System.out.println(Sum2);
        System.out.println("Checking if a Number is Integer");
        boolean b1= sc.hasNextInt();
        System.out.println(b1);
        String str= sc.nextLine();
        System.out.println(str);
    }

}

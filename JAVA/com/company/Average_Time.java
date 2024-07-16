package com.company;
import java.util.Scanner;
public class Average_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1");
        Float time_1 = sc.nextFloat();
        System.out.println("Enter 3");
        Float time_3 = sc.nextFloat();
        System.out.println("Enter 4");
        Float time_4 = sc.nextFloat();

        Double Average = ((time_1+time_4+time_3)-0.25*(time_1+time_4+time_3));
        System.out.println(Average);
    }
}

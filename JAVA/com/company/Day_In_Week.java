package com.company;
import java.util.Scanner;
public class Day_In_Week {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 to 7");
        int Number_of_Day;
        Scanner sc = new Scanner(System.in);
        Number_of_Day = sc.nextInt();

        switch (Number_of_Day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("No Day");
        }
    }
}

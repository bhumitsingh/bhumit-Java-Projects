package com.company;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("Choose the correct option.");
        System.out.println("What is the capital of India");
        System.out.println("1.Delhi 2.Mumbai 3.Kolkata 4.Bengaluru");
        int option;
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Correct!");
                break;
            case 2:
                System.out.println("Wrong!");
                break;
            case 3:
                System.out.println("Wrong!");
                break;
            case 4:
                System.out.println("Wrong!");
                break;
            default:
                System.out.println("Wrong!");
        }
    }
}

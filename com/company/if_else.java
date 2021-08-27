package com.company;
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your weight");
        Float weight = sc.nextFloat();
        System.out.println("Enter your height");
        Float height = sc.nextFloat();

        Float bmi = weight/(height*height);
        if (bmi>18.5){
            System.out.println("You are overweight");
        }
        if (bmi==18.5){
            System.out.println("You have a healthy body weight");
        }
        if (bmi<18.5){
            System.out.println("You are underweight");
        }
    }
}

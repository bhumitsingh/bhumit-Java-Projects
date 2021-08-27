package com.company;
import java.util.Scanner;
public class Pass_Fail {
    public static void main(String[] args) {
        int mathematics_marks;
        int physics_marks;
        int chemistry_marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in Mathematics");
        mathematics_marks = sc.nextInt();
        System.out.println("Enter the marks in Physics");
        physics_marks = sc.nextInt();
        System.out.println("Enter the marks in Chemistry");
        chemistry_marks = sc.nextInt();

        int percentage_mathematics = (mathematics_marks/80)*100;
        int percentage_physics = (physics_marks/80)*100;
        int percentage_chemistry = (chemistry_marks/80)*100;

        int Overall_Percentage=(mathematics_marks+physics_marks+chemistry_marks)/3;

        if (Overall_Percentage>40 && percentage_chemistry>33 && percentage_physics>33 && percentage_mathematics>33){
            System.out.println("Congratulations! You have passed the exam");
        }
        else {
            System.out.println("Sorry, you have failed the exam.\nBetter luck next time!");
        }
    }
}

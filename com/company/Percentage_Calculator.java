package com.company;

import java.util.Scanner;

public class Percentage_Calculator {
    public static void main(String[] args) {
        System.out.println("Percentage obtained in Board Exams(Science Stream)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Maximum Marks for exam:");
        int Max_marks= sc.nextInt();
        System.out.println("Marks obtained in Mathematics/Biology:");
        int Marks_Mathematics= sc.nextInt();
        System.out.println("Marks obtained in Physics:");
        int Marks_Physics= sc.nextInt();
        System.out.println("Marks obtained in Chemistry:");
        int Marks_Chemistry= sc.nextInt();
        System.out.println("Marks obtained in English:");
        int Marks_English= sc.nextInt();
        System.out.println("Marks obtained in Fifth Subject(P.E/I.P/Mathematics/C.S/Eco./F.A):");
        int Marks_Fifth_Subject= sc.nextInt();
        int percentage = (((Marks_Chemistry+Marks_English+Marks_Mathematics+Marks_Physics+Marks_Fifth_Subject)*100)/Max_marks);
        System.out.println("Percentage obtained by the student is:");
        System.out.println(percentage);
    }
}

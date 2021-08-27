package com.company;
import java.util.Scanner;

// Problem 1:Write a Java method to find the smallest number among three numbers.
//public class Method_In_Java{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter First Number");
//        double a = sc.nextDouble();
//        System.out.println("Enter Second Number");
//        double b = sc.nextDouble();
//        System.out.println("Enter Third Number");
//        double c = sc.nextDouble();
//        System.out.print("The smallest value is " + smallest(a, b, c)+"\n" );
//    }
//    public static double smallest(double a,double b,double c){
//        return Math.min(Math.min(a,b),c);
//    }
//}
// Problem 2:Write a Java method to compute the average of three numbers.
//public class Method_In_Java{
//    public static void main(String[] args) {
//        Scanner Yo = new Scanner(System.in);
//        System.out.println("Enter First Number");
//        double x = Yo.nextDouble();
//        System.out.println("Enter Second Number");
//        double y = Yo.nextDouble();
//        System.out.println("Enter Second Number");
//        double z = Yo.nextDouble();
//        System.out.println("The average of the three numbers is: " + average(x,y,z));
//    }
//    public static double average(double x, double y, double z){
//        double av = (x+ y+ z)/3;
//        return av;
//    }
//}
// Problem 3:Write a Java method to display the middle character of a string. Go to the editor
//Note: a) If the length of the string is odd there will be two middle characters.
//b) If the length of the string is even there will be one middle character.
//public class Method_In_Java{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter String:");
//        String str = sc.nextLine();
//        System.out.println("The Middle Character is: " + Middle(str) + "\n");
//    }
//    public static String Middle(String str){
//        int length;
//        int position;
//        if (str.length()%2==0){
//            position = str.length()/2-1;
//            length = 2;
//        }
//        else {
//            position =str.length()/2;
//            length = 1;
//        }
//        return str.substring(position,position+length);
//    }
//}
// Problem 4: Write a Java method to print the multiplication table of a number n.
//public class Method_In_Java {
//    static void table(int n){
//        for (int i = 1; i <= 10 ; i++){
//            System.out.format("%d x %d = %d\n",n,i,n*i);
//        }
//    }
//
//    public static void main(String[] args) {
//        table(9);
//    }
//}
// Problem 5: Write a program using functions to print the following pattern:
// o
// oo
// ooo
// oooo{
//public class Method_In_Java {
//    static void pattern1(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print("o");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern1(4);
//    }
//}
// Problem 6: Write a recursive function to calculate the sum of first n natural numbers.
//public class Method_In_Java {
//    static int sum(int n){
//        if (n==1){
//            return 1;
//        }
//        else {
//            return n + sum(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Natural Number:");
//        int c = sc.nextInt();
//        int sumrec = sum(c);
//        System.out.println(sumrec);
//
//    }
//}
// Problem 7: Write a function to print the following pattern:
//    oooo
//    ooo
//    oo
//    o
//public class Method_In_Java {
//    static void Pattern2(int n){
//        for (int i = n ; i>0 ; i--){
//            for (int j = 0 ; j<i ;j++){
//                System.out.print("o");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        Pattern2(4);
//    }
//}
// Problem 8: Write a function to print the nth term of the Fibonacci series using recursion.
// Fibonacci sequence = 0, 1, 1, 2, 3, 5, 8, 13...
//public class Method_In_Java {
//    static int fib(int n){
//        if (n==1 || n==2){
//            return n-1;
//        }
//        else {
//            return fib(n-1)+fib(n-2);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Natural Number");
//        int c = sc.nextInt();
//        int result= fib(c);
//        System.out.println(result);
//    }
//}

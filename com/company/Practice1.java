package com.company;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an Integer");
//        int testInteger = sc.nextInt();
//        if (testInteger>0){
//            System.out.println("The number is Positive.");
//        }
//        else if(testInteger<0){
//            System.out.println("The number is Negative.");
//        }
//        else if (testInteger==0){
//            System.out.println("The number is neither positive nor negative.");
//        }
//        int n = 2;
//        for(int i = 1; i<=10; i++){
//            System.out.println(n+" x "+i+" = "+n*i);
//        }
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        for(int i = 0; i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            for(int j = 0;j<n;j++){
//                a+=b;
//                if (j>0)
//                    System.out.print(" ");
//                System.out.print(a);
//
//                b=b*2;
//            }
//            System.out.println("");
//        }
//        in.close();
//        Star Pattern Program
         //Square Pattern
        int n = 5;
//        for(int i = 1; i<=n; i++){
//            for (int j = 1; j<=n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i = 1; i<=n; i++){
//            for (int j = 1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i = 1; i<=n; i++){
//            for(int j = i; j<=n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for(int i = 1; i<=n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i =1; i <=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("  ");
            }
            for (int j =i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i<= n; i++){
            for (int j = i; j<=n; j++){
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++){
                System.out.print("* ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("  ");
            }
            for (int j = i; j < n; j++){
                System.out.print("* ");
            }
            for (int j = i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

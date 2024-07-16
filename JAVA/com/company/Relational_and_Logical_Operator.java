package com.company;

public class Relational_and_Logical_Operator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;

        if (a && b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        boolean a1 = false;
        boolean b2 = false;

        if (a1 || b2){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("NOT(a) is ");
        System.out.println(!a);
        System.out.println("NOT(b) is ");
        System.out.println(!b);
    }
}

package com.company;
import java.util.Scanner;

public class JavaDatatypesQuestions {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++){ 
        try {
            long x = sc.nextLong();
            System.out.println(x+" can be fitted in:");
            if (x>= Byte.MAX_VALUE && x<=Byte.MAX_VALUE) System.out.println("* byte");
            if (x>= Short.MAX_VALUE && x<=Short.MAX_VALUE) System.out.println("* short");
            if (x>= Integer.MAX_VALUE && x<=Integer.MAX_VALUE) System.out.println("* int");
            if (x>= Long.MAX_VALUE && x<=Long.MAX_VALUE) System.out.println("* long");
        } catch(Exception e){
            System.out.println(" can't be fitted anywhere.");
        }
        sc.close();
    }
}

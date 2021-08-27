package com.company;
import java.util.Arrays;

public class Arrays_Practice {
    public static void main(String[] args) {
        //Write a Java program to sort a numeric array and a string array.
//        int[] myArray1 = {1234, 2314, 6574, 4234, 6782, 4517, 5765};
//        String[] myArray2 = {"bhumit","nandani","raj shubham","priya","neha"};
//        System.out.println("Original numeric Array" + Arrays.toString(myArray1));
//        Arrays.sort(myArray1);
//        System.out.println("Sorted Array" + Arrays.toString(myArray1));
//        System.out.println("Original String Array" + Arrays.toString(myArray2));
//        Arrays.sort(myArray2);
//        System.out.println("Sorted Array" + Arrays.toString(myArray2));
        //Write a Java program to sum values of an array.
        int[] myArray = {7,8,9,10};
        int sum = 0;
        for (int i : myArray){
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}

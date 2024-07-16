package com.Bhumit;
class CalculateCube{
    static int cube(int x){
        return x*x*x;
    }
}
public class FindCube {
    public static void main(String[] args) {
        int result = CalculateCube.cube(5);
        System.out.println(result);
    }
}

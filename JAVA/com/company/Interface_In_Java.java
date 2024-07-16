package com.company;

interface Bicycle{
    int a = 45;
    void accelerate(int increment);
    void decelerate(int decrement);
}
interface HornBicycle{
    int x = 45;
    void BlowHorn1();
    void BlowHorn2();
}
class MyBicycle implements Bicycle,HornBicycle{
    @Override
    public void accelerate(int increment) {
        System.out.println("Accelerating...");
    }

    @Override
    public void decelerate(int decrement) {
        System.out.println("Decelerating...");
    }

    @Override
    public void BlowHorn1() {
        System.out.println("Pee Pee Pee Pee");
    }
    public void BlowHorn2() {
        System.out.println("Po Po Po Po");
    }
}
public class Interface_In_Java {
    public static void main(String[] args) {
        MyBicycle ms = new MyBicycle();
        ms.accelerate(3);
        ms.decelerate(5);
        ms.BlowHorn1();
        ms.BlowHorn2();
    }
}

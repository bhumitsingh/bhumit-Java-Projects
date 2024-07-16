package com.Bhumit;
class Bike1{
    Bike1(){
        System.out.println("Bike is created");
    }
}
class Student3{
    int ID;
    String Name;
    void Display(){
        System.out.println(ID+" "+Name);
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        Bike1 b = new Bike1();
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();

        s1.Display();
        s2.Display();
    }
}

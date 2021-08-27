package com.company;
class Base1{
    public Base1(){
        System.out.println("I am a Constructor");
    }
    public Base1(int x){
        System.out.println("I am an overloaded constructor with value of X as: " + x);
    }
}
class Derived1 extends Base1{
    public Derived1(){
//        super(0);
        System.out.println("I am a Derived Class Constructor");
    }
    public Derived1(int x,int y){
        super(x);
        System.out.println("I am an overloaded constructor with value of Y as: " + y);
    }
}
class Child_Of_Derived extends Derived1{
    public Child_Of_Derived(){
        System.out.println("I am a constructor in Child_Of_Derived Class" );
    }
    public Child_Of_Derived(int x ,int y ,int z){
        super(x, y);
        System.out.println("I am an overloaded constructor with value of z as: " + z);
    }
}
public class Constructors_In_Inheritance {
    public static void main(String[] args) {
        Base1 B = new Base1();
        Base1 b = new Base1(23);
        Derived1 D = new Derived1();
        Derived1 d = new Derived1(3,4);
        Child_Of_Derived C = new Child_Of_Derived();
        Child_Of_Derived c = new Child_Of_Derived(23,12,15);
    }
}

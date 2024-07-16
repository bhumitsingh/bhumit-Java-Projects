package com.company;

class circle2{
    public int radius;
    circle2(){
        System.out.println("I am not a parameter of circle class");
    }
    circle2(int r){
        System.out.println("I am a parameter of circle class");
        this.radius =r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder2 extends circle2{
    public int height;
    cylinder2(int r, int h){
        super(r);
        System.out.println("I am parameter of cylinder class");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Inheritance_In_Java_Practice {
    public static void main(String[] args) {
//        circle2 objc = new circle2(13);
        cylinder2 objcy = new cylinder2(13,24);
        System.out.println("The area of cylinder is: " + objcy.volume());
        System.out.println("The volume of circle is: " + objcy.area());
    }
}

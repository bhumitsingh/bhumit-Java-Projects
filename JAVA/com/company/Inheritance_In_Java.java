package com.company;

class base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting X now");
        this.x = x;
    }
    public void printme(){
        System.out.println("I am a Constructor");
    }
}
class derived extends base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance_In_Java {
    public static void main(String[] args) {
        // Creating Object of Base class
        base b = new base();
        b.setX(13);
        System.out.println(b.getX());
        // Creating object of Derived Class
        derived d = new derived();
        d.setX(23);
        System.out.println(d.getX());
        d.setY(14);
        System.out.println(d.getY());
    }
}

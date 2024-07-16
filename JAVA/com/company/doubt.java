package com.company;

class Rectangle{
    int length;
    int breadth;

    public Rectangle(){
        this.length=4;
        this.breadth=5;
    }
    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class doubt {
    public static void main(String[] args) {
        Rectangle rect2 = new Rectangle(12,13);
        System.out.println(rect2.getLength());
        System.out.println(rect2.getBreadth());
    }
}

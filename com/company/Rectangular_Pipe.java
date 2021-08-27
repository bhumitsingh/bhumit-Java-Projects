package com.company;

class CrossSectionOfRectangularPipe{
    public double length;
    public double breadth;

    CrossSectionOfRectangularPipe(int l, int b) {
        this.length=l;
        this.breadth=b;
    }
    public double cross_sectional_area(int l ,int b){
        return this.length*this.breadth;
    }
}
class RectangularPipe extends CrossSectionOfRectangularPipe{
    public double height;

    RectangularPipe(int l, int b ,int h) {
        super(l, b);
        this.height=h;
    }
    public double volume(){
        return this.length*this.breadth*this.height;
    }
}
public class Rectangular_Pipe {
    public static void main(String[] args) {
        RectangularPipe obj = new RectangularPipe(12,14,31);
        System.out.println("The volume of pipe is: " + obj.volume());
    }
}

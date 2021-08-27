package com.company;
class cylinder{
    int radius;
    int height;

    public cylinder(int radius, int height){
        this.height=height;
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surface_area(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
class sphere{
    int radius;

    public sphere(int radius){
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surface_area2(){
        return 4*Math.PI*radius*radius;
    }
    public double volume2(){
        return ((4*Math.PI*radius*radius*radius)/3);
    }
}



public class Access_Modifiers_Constructors_Practice {
    public static void main(String[] args) {
        cylinder c2 = new cylinder(34,45);
//        c2.setHeight(12);
        System.out.println("Height of the Cylinder is : " + c2.getHeight());
//        c2.setRadius(15);
        System.out.println("Radius of the Cylinder is : " + c2.getRadius());
        System.out.println("Surface area of the Cylinder is: " + c2.surface_area());
        System.out.println("Volume of the Cylinder is : " + c2.volume());



        sphere sp = new sphere(13);
        System.out.println("Radius of the Sphere is: " + sp.getRadius());
        System.out.println("Surface Area of the Sphere is: " + sp.surface_area2());
        System.out.println("Volume of the Sphere is: " + sp.volume2());

    }
}

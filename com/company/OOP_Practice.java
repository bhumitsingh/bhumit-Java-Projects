package com.company;

class MyMainEmployee{
    int ID;
    String NAME;
    int Salary;
    public void setID(int i) { this.ID = i; }
    public int getID(){
        return ID;
    }
    public void setNAME(String Name){
        this.NAME = Name;
    }
    public String getNAME(){
        return NAME;
    }
    public void setSalary(int s){ this.Salary = s;}
    public int getSalary(){ return Salary; }}
class Cellphone{
    public void callFriend(){ System.out.println("Calling"); }
    public void vibrate(){ System.out.println("Vibrating"); }
    public void ring(){ System.out.println("Sending"); }
}
class square{
    int side;
    public int area(){ return side*side; }
    public int perimeter(){ return 4*side; }
}
class rectangle {
    int side1;
    int side2;
    public int area() { return side1 * side2; }
    public int perimeter() { return  ((side1 +side2)*2); }
}
class circle{
    int radius;
    public double area(){ return radius*radius*3.14; }
    public double perimeter(){ return 2*3.14*radius;}
}
public class OOP_Practice {
    public static void main(String[] args) {
//        Problem 1:
        MyMainEmployee bhumit = new MyMainEmployee();
        bhumit.setID(1);
        bhumit.setNAME("Bhumit Dev Singh");
        bhumit.setSalary(200000);
        System.out.println("ID: " + bhumit.getID());
        System.out.println("Name: " + bhumit.getNAME());
        System.out.println("Salary: " + bhumit.getSalary());
//        Problem 2:
        Cellphone Samsung = new Cellphone();
        Samsung.callFriend();
        Samsung.vibrate();
        Samsung.ring();
//        Problem 3:
        square sq = new square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
//        Problem 4:
        rectangle rect = new rectangle();
        rect.side1 = 2;
        rect.side2 = 3;
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
//        Problem 5
        circle cir = new circle();
        cir.radius = 5;
        System.out.println(cir.area());
        System.out.println(cir.perimeter());

    }
}


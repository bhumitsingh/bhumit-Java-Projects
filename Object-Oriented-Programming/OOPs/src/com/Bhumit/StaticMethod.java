package com.Bhumit;
class Student8{
    int RollNumber;
    String Name;
    static  String college ="ITS";
    static void change(){
        college = "BBDIT";
    }
    Student8(int r,String n){
        RollNumber = r;
        Name = n;
    }
    void Display(){
        System.out.println(RollNumber+" "+Name+" "+college);
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        Student8.change();

        Student8 s1 = new Student8(111,"Priya");
        Student8 s2 = new Student8(112,"Bhumit");
        s1.Display();
        s2.Display();
    }
}

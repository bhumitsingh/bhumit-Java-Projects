package com.Bhumit;
class Student7{
    int RollNumber;
    String Name;
    static String college = "ITS";
    Student7(int r, String n){
        RollNumber = r;
        Name = n;
    }
    void Display(){
        System.out.println(RollNumber+" "+Name+" "+college);
    }
}
public class staticVariable {
    public static void main(String[] args) {
        Student7 s1 = new Student7(111,"Bhumit");
        Student7 s2 = new Student7(112,"Neha");

        s1.Display();
        s2.Display();
    }
}

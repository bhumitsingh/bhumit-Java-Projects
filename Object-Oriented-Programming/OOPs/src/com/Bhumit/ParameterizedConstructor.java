package com.Bhumit;
class Student4{
    int ID;
    String Name;
    Student4(int i, String n){
        ID = i;
        Name = n;
    }
    void Display(){
        System.out.println(ID+ " " +Name);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student4 s1 = new Student4(111,"Bhumit");
        Student4 s2 = new Student4(112,"Neha");

        s1.Display();
        s2.Display();
    }
}

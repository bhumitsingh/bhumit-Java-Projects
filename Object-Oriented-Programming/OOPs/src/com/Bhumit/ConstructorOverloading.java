package com.Bhumit;
class Student5{
    int id;
    String name;
    int age;

    Student5(int i,String n){
        id = i;
        name = n;
    }
    Student5(int i, String n,int a){
        id = i;
        name = n;
        age = a;
    }
    void Display(){
        System.out.println(id+" "+name+" "+age);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Student5 s1 = new Student5(111,"Neha");
        Student5 s2 = new Student5(222,"Bhumit",18);

        s1.Display();
        s2.Display();
    }
}

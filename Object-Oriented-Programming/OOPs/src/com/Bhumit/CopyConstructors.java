package com.Bhumit;
class Student6{
    int id;
    String Name;

    Student6(int i, String n){
        id =i;
        Name= n;
    }
    Student6(Student6 s){
        id = s.id;
        Name = s.Name;
    }
    void Display(){
        System.out.println(id+" "+Name);
    }
}
public class CopyConstructors {
    public static void main(String[] args) {
        Student6 s1 = new Student6(111,"Bhumit");
        Student6 s2 = new Student6(s1);

        s1.Display();
        s2.Display();
    }
}

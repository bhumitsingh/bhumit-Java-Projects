package com.Bhumit;
class Student9{
    int RollNumber;
    String name;
    float fee;
    Student9(int RollNumber, String name, float fee){
        this.RollNumber=RollNumber;
        this.name=name;
        this.fee=fee;
    }
    void display(){
        System.out.println(RollNumber+" "+name+" "+fee);
    }
}
public class thisKeyword {
    public static void main(String[] args) {
        Student9 s1 = new Student9(111,"Bhumit",50000f);
        Student9 s2 = new Student9(112,"Neha",60000f);
        s1.display();
        s2.display();
    }
}

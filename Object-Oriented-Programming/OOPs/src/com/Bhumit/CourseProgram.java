package com.Bhumit;
class Student10{
    int RollNumber;
    String Name,Course;
    float Fee;
    Student10(int RollNumber,String Name,String Course){
        this.RollNumber=RollNumber;
        this.Name=Name;
        this.Course= Course;
    }
    Student10(int RollNumber,String Name, String Course,float Fee){
        this(RollNumber,Name,Course);
        this.Fee=Fee;
    }
    void display(){
        System.out.println(RollNumber+" "+Name+" "+Course+" "+Fee);
    }
}
public class CourseProgram {
    public static void main(String[] args) {
        Student10 s1 = new Student10(112,"Bhumit","Python");
        Student10 s2 = new Student10(113,"Neha","Java",6000f);
        s1.display();
        s2.display();
    }
}

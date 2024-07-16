package com.Bhumit;
class Employee{
    int ID;
    String Name;
    float Salary;
    void InsertInfo(int i, String n, float sal){
        ID = i;
        Name = n;
        Salary = sal;
    }
    void DisplayInfo(){
        System.out.println(ID + " " + Name + " " + Salary);
    }
}
public class Company {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.InsertInfo(101,"Oze",30000);
        e2.InsertInfo(102,"Neha",31000);
        e3.InsertInfo(103,"Priya",33000);

        e1.DisplayInfo();
        e2.DisplayInfo();
        e3.DisplayInfo();
    }
}

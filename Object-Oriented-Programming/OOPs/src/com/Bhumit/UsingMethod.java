package com.Bhumit;
class StudentNew{
    int RollNumber;
    String name;
    void InsertRecord(int r, String n){
        RollNumber = r;
        name = n;
    }
    void displayInfo(){
        System.out.println(RollNumber + " " + name);
    }
}

public class UsingMethod {
    public static void main(String[] args) {
        StudentNew s1 = new StudentNew();
        StudentNew s2 = new StudentNew();

        s1.InsertRecord(111,"Darshan");
        s2.InsertRecord(112, "Priya");

        s1.displayInfo();
        s2.displayInfo();
    }
}

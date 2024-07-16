package com.Bhumit;
class Student2{
    private int RollNumber;
    private String Name;
    public int getRollNumber(){
        return RollNumber;
    }
    public void setRollNumber(int RollNumber){
        this.RollNumber=RollNumber;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void Display(){
        System.out.println("Roll Number: "+RollNumber);
        System.out.println("Name: "+Name);
    }
}
public class AccessorAndMutator {
    public static void main(String[] args) {
        Student2 S1 = new Student2();
        S1.setName("Bhumit Dev Singh");
        S1.setRollNumber(101);
        System.out.print(S1.getName()+ " ");
        System.out.print(S1.getRollNumber());
    }
}

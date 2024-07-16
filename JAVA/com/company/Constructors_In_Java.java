package com.company;
class MyEmployees{
    private int Id;
    private String Name;

    public MyEmployees(){
        Id = 10;
        Name = "Bhumit Singh";
    }

    public MyEmployees( String myName, int myId){
        Id = myId;
        Name = myName;
    }
    public MyEmployees(String Name2){
        Id = 35;
        Name = Name2;
    }
    public String getName(){
        return Name;
    }
    public void setName(String n){
        this.Name = n;
    }
    public void setId(int i){
        this.Id = i;
    }
    public int getId(){
        return Id;
    }
}
public class Constructors_In_Java {
    public static void main(String[] args) {
        MyEmployees Bhumitbhai = new MyEmployees("Bhumit");
        MyEmployees Bhumitji = new MyEmployees("Bhumit", 12);
        MyEmployees BhumitSingh = new MyEmployees();
        System.out.println(Bhumitbhai.getId());
        System.out.println(Bhumitbhai.getName());
        System.out.println(Bhumitji.getId());
        System.out.println(Bhumitji.getName());
        System.out.println(BhumitSingh.getId());
        System.out.println(BhumitSingh.getName());
    }
}

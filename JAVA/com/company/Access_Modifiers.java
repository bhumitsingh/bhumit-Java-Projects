package com.company;
class MyEmployee{
    private int Id;
    private String Name;

    public String getName(){
        return Name;
    }
    public void setName(String n){
        this.Name = n;
    }
    public void setId(int i){
        this.Id = i;
    }

    public int getId() {
        return Id;
    }
}
public class Access_Modifiers {
    public static void main(String[] args) {
        MyEmployee Bhumit = new MyEmployee();
        Bhumit.setId(209);
        Bhumit.setName("Bhumit Dev Singh");
        System.out.println(Bhumit.getId());
        System.out.println(Bhumit.getName());

    }
}

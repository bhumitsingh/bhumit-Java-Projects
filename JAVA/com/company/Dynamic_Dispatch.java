package com.company;
class phone{
    public void ShowTime(){
        System.out.println("Time is 8 a.m.");
    }
    public void On(){
        System.out.println("Turning On Phone....");
    }
}
class Smartphone extends phone{
    public void music(){
        System.out.println("Playing Music...");
    }
    public void On(){
        System.out.println("Turning on Smartphone...");
    }
}
public class Dynamic_Dispatch {
    public static void main(String[] args) {
        phone obj =new Smartphone();
        obj.ShowTime();
        obj.On();
    }
}

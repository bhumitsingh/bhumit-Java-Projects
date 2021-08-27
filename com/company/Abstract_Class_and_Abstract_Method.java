package com.company;

abstract class Father{
    public Father(){
        System.out.println("I belong to Father Class");
    }
    public void SayHello(){
        System.out.println("Hello!");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Kid extends Father{
    public void greet(){
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}
abstract class kid2 extends Father{
    public void th(){
        System.out.println("I am Good.");
    }
}
public class Abstract_Class_and_Abstract_Method {
    public static void main(String[] args) {
        Kid c = new Kid();
        c.greet();
        
    }
}

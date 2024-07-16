package com.Bhumit;
abstract class Demo{
    abstract void display();
}
class myClass extends Demo{
    @Override
    void display() {
        System.out.println("Abstract Class");
    }

}
public class AbstractMethod {
    public static void main(String[] args) {
        myClass obj = new myClass();
        obj.display();
    }
}

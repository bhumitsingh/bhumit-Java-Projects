package com.Bhumit;
class B{
    B(){
        System.out.println("Hello B");
    }
    B(int x){
        this();
        System.out.println(x);
    }
}
public class InvokeClassConstructor {
    public static void main(String[] args) {
        B a = new B(10);
    }
}

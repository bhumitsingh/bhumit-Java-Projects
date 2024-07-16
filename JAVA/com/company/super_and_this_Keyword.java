package com.company;

class firstclass{
    int x;
    public int getX() {
        return x;
    }

    firstclass(int x) {
        this.x = x;
    }
    public int firstclass(){
        return 1;
    }
}
class SecondClass extends firstclass{
    SecondClass(int c){
        super(c);
        System.out.println("I am a Constructor");
    }
}
public class super_and_this_Keyword {
    public static void main(String[] args) {
        firstclass f = new firstclass(3);
        SecondClass s = new SecondClass(4);
        System.out.println(s.getX());
        System.out.println(f.getX());

    }
}


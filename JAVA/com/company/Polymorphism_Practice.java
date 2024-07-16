package com.company;
class Interrogator{
    public static void convinceToTalk(Animal subject){
        subject.talk();
    }
}
abstract class Animal{
    public abstract void talk();
}
interface Flight{
    public void fly();
}
class Aeroplane implements Flight{
    public void fly(){
        System.out.println("Zooo!!");
    }
}
class Bat implements Flight{
    public void fly(){
        System.out.println("Bap Bap!!");
    }
}
class Bird implements Flight{
    public void fly(){
        System.out.println("Flap Flap");
    }
}
class Dog extends Animal{
    public void talk(){
        System.out.println("Woof!!");
    }
}
class Poodle extends Dog{
    public void talk(){
        System.out.println("Yip!!");
    }
}
class Cat extends Animal{
    public void talk(){
        System.out.println("Meow!!");
    }
}

public class Polymorphism_Practice {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Poodle poodle = new Poodle();
        Animal animal = new Dog();
        Aeroplane aeroplane = new Aeroplane();
        Bat bat = new Bat();
        Bird bird = new Bird();


        Interrogator.convinceToTalk(dog);
        Interrogator.convinceToTalk(cat);
        Interrogator.convinceToTalk(animal);
        Interrogator.convinceToTalk(poodle);
        aeroplane.fly();
        bird.fly();
        bat.fly();
        }
    }

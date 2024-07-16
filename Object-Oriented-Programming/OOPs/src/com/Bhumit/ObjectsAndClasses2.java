package com.Bhumit;

public class ObjectsAndClasses2 {
    public static void main(String[] args) {
        Student s2 = new Student();
        Student s3 = new Student();

        s2.id = 101;
        s2.name="Bhumit";
        s3.id = 102;
        s3.name = "Neha";

        System.out.println(s2.id+ " " + s2.name);
        System.out.println(s3.id+ " " + s3.name);
    }
}

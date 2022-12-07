package com.kh.day09.insof;

public class InstanceOfEx {
    static void print(Person p) {
        //Person p = new Person();
       // System.out.println("Person 입니다.");
        if (p instanceof Student)
            System.out.println("Student 입니다.");
        if (p instanceof Researcher) {
            System.out.println("Researcher 입니다.");
        }
        if (p instanceof Professor) {
            System.out.println("Professor 입니다.");
        }
    }

    public static void main(String[] args) {
        //print(new Person());
        print(new Student());
        print(new Researcher());
        print(new Professor());
    }
}

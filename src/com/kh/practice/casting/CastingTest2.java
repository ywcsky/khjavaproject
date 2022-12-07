package com.kh.practice.casting;

class Parent {
    private int i;

    public Parent() {
    }

    public void study(){
        System.out.println("공부한다.");
    }
    public void eat() {
        System.out.println("먹는다");
    }
}

class Child extends Parent {
    int a = 0;

    public Child() {
    }

    @Override
    public void eat() {
        System.out.println("먹습니다.");
    }

    public void walk() {
        System.out.println("걷습니다.");
    }
}

class Student extends Parent {

    public Student() {
    }

    public void study() {
        System.out.println("공부합니다.");
    }
}

public class CastingTest2 {
    public static void main(String[] args) {
        Parent p = new Child();

        p.eat();

        ((Child) p).walk();
        Parent p1 = new Student();
        p1.eat();
        p1.study();


    }
}
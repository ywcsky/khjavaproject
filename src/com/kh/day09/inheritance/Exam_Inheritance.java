package com.kh.day09.inheritance;

import com.kh.day09.point.Point;

import java.lang.reflect.Parameter;

class BlackPoint extends Point {
    void set(){
        pub = 1;
//        def = 1;
        pro = 1;
//        pri = 4;
    }
}

class Child extends Parent {
    void set() {
        pub = 1;
        def = 1;
        pro = 1;
//        pri = 1;
    }
}

class Parent {
    public int pub;
    int def;
    protected int pro;
    private int pri;

    public Parent(){

    }

    private int money = 2000;

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money += money;
    }
}

public class Exam_Inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Parent money : " + child.getMoney());

    }
}

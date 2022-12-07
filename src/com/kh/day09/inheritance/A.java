package com.kh.day09.inheritance;

class A {
    public A() {
        System.out.println("생성자 A");
    }

    public A(int x) {
        System.out.println("생성자 A " + x);
    }
}

class B extends A {
    public B() {
        System.out.println("생성자 B");
    }

    public B(int x) {
        System.out.println("매개변수 생성자 B");
    }
}

class ab {
    public static void main(String[] args) {
        B b;
        b = new B();
    }
}
package com.kh.practice.interfaceex;

public class Wang implements Human{

    @Override
    public void walk() {
        System.out.println("왕씨가 걷는다");
    }

    @Override
    public void speak() {
        System.out.println("왕씨가 말한다.");
    }
}

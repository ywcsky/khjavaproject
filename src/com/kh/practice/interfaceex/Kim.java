package com.kh.practice.interfaceex;

public class Kim implements Human{

    @Override
    public void walk() {
        System.out.println("김씨가 걷는다");
    }

    @Override
    public void speak() {
        System.out.println("김씨가 말한다");

    }
}

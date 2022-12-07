package com.kh.practice.interfaceex;

public class Seo implements Human{

    @Override
    public void walk() {
        System.out.println("서씨가 걷는다");
    }

    @Override
    public void speak() {
        System.out.println("서씨가 말한다.");
    }
}

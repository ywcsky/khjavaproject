package com.kh.practice.interfaceex;

public class Ani implements Human{

    @Override
    public void walk() {
        System.out.println("아니가 걷는다");
    }

    @Override
    public void speak() {
        System.out.println("아니가 말한다.");
    }

    @Override
    public void shooting(){
        System.out.println("아니는 군인이다. 그래서 총을 쏜다");
    }
}

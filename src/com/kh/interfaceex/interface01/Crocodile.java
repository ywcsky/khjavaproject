package com.kh.interfaceex.interface01;

public class Crocodile extends Animal implements Predator, Barkable {

    @Override
    public String getFood() {
        return "김";
    }

    @Override
    public void printFood() {
        Predator.super.printFood();
    }

    @Override
    public void bark() {
        System.out.println("쾅쾅");
    }
}

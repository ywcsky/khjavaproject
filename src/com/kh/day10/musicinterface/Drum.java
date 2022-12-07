package com.kh.day10.musicinterface;

public class Drum implements Instrument {
    public void play(){
        System.out.println("둥둥타 두둠칫");
    }

    @Override
    public void makeSound() {
        System.out.println("두둠칫 둥둥타");
    }
}

package com.kh.day10.musicinterface;

public class Guitar implements Instrument {
    public void play(){
        System.out.println("CDEFGAB");
    }

    @Override
    public void makeSound() {
        System.out.println("BAGFEDC");
    }
}

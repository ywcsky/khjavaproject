package com.kh.practice.zoointerface;

public class Bear extends Animal implements Predator{
    @Override
    public String animalFood() {
        return "Honey";
    }
}

package com.kh.practice.zoointerface;

public class Tiger extends Animal implements Predator{

    @Override
    public String animalFood() {
        return "beef";
    }
}

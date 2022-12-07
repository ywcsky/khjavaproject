package com.kh.practice.zoointerface;

public class Lion extends Animal implements Predator{

    @Override
    public String animalFood() {
        return "gazel";
    }
}

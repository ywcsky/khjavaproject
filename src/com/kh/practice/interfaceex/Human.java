package com.kh.practice.interfaceex;

public interface Human {
    void walk();
    void speak();
    default void shooting(){
        System.out.println("총을 쏜다.");
    }
}

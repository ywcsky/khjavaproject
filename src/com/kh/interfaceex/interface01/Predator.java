package com.kh.interfaceex.interface01;

public interface Predator {
    String getFood();
    default void printFood(){
        System.out.printf(" food is %s\n", getFood());
    }
    int LEG_COUNT = 4;

    static int speed(){
        return LEG_COUNT * 30;
    }

}

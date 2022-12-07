package com.kh.practice.jumptojava.calculator.Q3;

public class Calculator {
    int value;

    Calculator(){
        this.value = 0;
    }

    void add(int val){
        this.value += val;
    }

    int getValue(){
        return this.value;
    }

    boolean isOdd(){
       boolean b = value % 2 == 0;
        return b;
    }
}

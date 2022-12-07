package com.kh.practice.jumptojava.calculator;

class Calculator {
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
}

class UpgradeCalculator extends Calculator {
    void minus(int val){
        this.value -= val;
    }
}

public class Sample {
    public static void main(String[] args) {
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());

    }
}

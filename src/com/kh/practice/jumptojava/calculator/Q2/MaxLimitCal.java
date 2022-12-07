package com.kh.practice.jumptojava.calculator.Q2;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

}

class MaxLimitCalculator extends Calculator {
    @Override
    void add(int val){
        this.value += val;
        if(value > 100){
            int val2 = value - 100;
            value -= val2;
        }
    }
}

public class MaxLimitCal {
    public static void main(String[] args) {
        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);
        cal.add(60);
        System.out.println(cal.getValue());
    }

}

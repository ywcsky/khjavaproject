package com.kh.practice.jumptojava.calculator.Q5;

import com.kh.day10.exercise.Calculator;

class Gold implements Mineral {

    @Override
    public void add() {
    }
}

class Silver implements Mineral {

    @Override
    public void add() {
    }
}

class Bronze implements Mineral {
    @Override
    public void add() {
    }
}

class MineralCalculator {
    int value = 0;

    public void add(Gold gold) {
        this.value += 100;
    }

    public void add(Silver silver) {
        this.value += 90;
    }

    public void add(Bronze bronze) {
        this.value += 80;
    }

    public int getValue() {
        return this.value;
    }
}

public class Sample {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());
    }
}

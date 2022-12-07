package com.kh.day10.exercise;

import java.util.Scanner;

public class GoodCalc extends Calculator{
    @Override
    public int multiple(int a, int b) {
        return a*b;
    }

    @Override
    public int substract(int a, int b) {
        return a-b;
    }

    @Override
    public double average(int[] a) {
        double sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum/a.length;
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
      GoodCalc g = new GoodCalc();
        System.out.println(g.add(1,5));
        System.out.println(g.substract(1,34));
        System.out.println(g.average(new int [] {1,5,6,7}));
        System.out.println(g.multiple(5,7));
    }
}

package com.kh.day11.wrapperex;

import com.kh.day11.exercise.Exercise_Wrapper;

public class Exam_BoxingUnBoxing {
    public static void main(String[] args) {
        Integer num = 2;
        // Boxing / Integer.valueOf() 생략

        int soo = num.intValue();
        // UnBoxing / num.intvalue() 생략
        soo = num;

        int n = 10;
        Integer intObject = n; // boxing
        System.out.println("intObject : " + intObject);

        int m = intObject + 10; // nuboxing
        System.out.println("m = " + m);

    }
}

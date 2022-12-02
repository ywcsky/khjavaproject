package com.kh.day07.run;

import com.kh.day07.oop.Ractangle_1;
import com.kh.day07.oop.Rectangle;

import java.util.Random;

public class RectRun {
    public static void main(String[] args) {
        Ractangle_1 rect = new Ractangle_1(10,20);
        System.out.println("크기의 값 : " + rect.getArea());
    }
}

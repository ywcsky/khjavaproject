package com.kh.day09.overriding;

import com.kh.day07.oop.Ractangle_1;

public class MethodOverridingEx {
    static void paint(Shape p){
        p.draw();
    }
    public static void main(String[] args) {
        Line line = new Line();
//        line.draw();
    paint(line);
    paint(new Rect());
    paint(new Circle());
    }
}

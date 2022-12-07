package com.kh.day10.abstractex;

class Line extends Shape{
    @Override
    public void draw() {
        System.out.println("재정의 || 오버라이딩 함");
    }
}

public abstract class Shape {
    public Shape() {
    } //생성자

    public void paint() {
    }

     abstract public void draw();

}
class run{
    public static void main(String[] args) {
        Line l = new Line();
        l.draw();
        Shape s = new Line();
        s.draw();
    }
}

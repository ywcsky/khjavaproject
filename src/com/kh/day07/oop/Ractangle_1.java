package com.kh.day07.oop;

public class Ractangle_1 {
    private int width, hight;

    public Ractangle_1(){
    }

    // 매개변수 있는 생성자
    public Ractangle_1(int width, int hight){
        this.width = width;
        this.hight = hight;
    }

    public int getArea(){
        int area = width*hight;
        return area;
    }
}

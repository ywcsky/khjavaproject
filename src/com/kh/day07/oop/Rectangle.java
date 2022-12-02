package com.kh.day07.oop;

public class Rectangle {
    // 필드
    private int width, hight;

    //메소드, 생성자
    public Rectangle() {
        this.width = width;
        this.hight = hight;
    }

    //
    public int getArea() {
        int area = width * hight;
        return area;
    }

    public int getWidth() {
        return width;
    }

    // 값을 입력받는 set 이므로 반환형 없음
    public void setWidth(int width) {
        this.width = width;
    }

    //값을 출력하는 get 이므로 반환형 있음
    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
}

package com.kh.day07.oop;

public class Circle { //클래스 선언(class Circle), 클래스 접근 권한 public
    public int radius;  //접근 지정자 public
    public String name; //접근 지정자 public

    //메소드
    //클래스 == 메소드, 생성자, 객체생성, !필드 초기화!
    public Circle(){    //접근 지정자 public
    this.radius = 1;
    this.name = "원";
    }

    // 반환형이 있는 메소드(리턴,반환값이 있음)
    public double getArea(double radius){ //접근 지정자 public
        double area = 3.14*radius*radius;
        return area;
        // return 3.14*radius*radius; 변수를 선언 차이

    }
}

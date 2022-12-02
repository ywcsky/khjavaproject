package com.kh.day07.run;

import com.kh.day07.exercise.Exercise_Lotto;
import com.kh.day07.oop.Circle;
import com.kh.day07.oop.Person;
import com.kh.day07.oop.Rectangle;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Exercise_Lotto el = new Exercise_Lotto();
//        int cont = 0;
//        while (cont <30) {
//            el.lottoProgram();
//            System.out.println();
//            cont++;
//        }
//        Person p = new Person();
//        p.eat();
//        p.sleep();
//        p.speak();
//        p.walking();
//        p.name = "일용자";
//        p.job = "의사";

//        Circle c = new Circle();
//        System.out.println(c.getArea(3.14));
        // 레퍼런스 변수 선언
        // 참조 변수 선언
        // 주소가 저장되는 변수
        Rectangle r = new Rectangle();
        // 객체의 멤버 접근 / . 으로 진행
        // 인스턴스 == 특정 클래스의 객체
        System.out.print("너비 입력 : ");
        r.setWidth(sc.nextInt()); // 멤버 변수가 private 이므로 set을 통한 우회접근 / 캡슐화

        System.out.print("높이 입력 : ");
        r.setHight(sc.nextInt()); // 멤버 변수가 private 이므로 set을 통한 우회접근 / 캡슐화

        System.out.println("결과 : " + r.getArea());


    }
}

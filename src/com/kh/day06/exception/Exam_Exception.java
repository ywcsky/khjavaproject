package com.kh.day06.exception;

import java.util.Scanner;

public class Exam_Exception {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("정수 하나 입력 : ");
            int num1 = sc.nextInt();
            System.out.print("정수 하나 더 입력 : ");
            int num2 = sc.nextInt();
            System.out.println("정수를 나누기");
            int result = num1 / num2;
            System.out.println("몫은 " + result + "입니다.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌수 없음");
        }
    }
}

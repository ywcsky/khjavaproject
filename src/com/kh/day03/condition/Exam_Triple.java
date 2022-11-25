package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Triple {
    public static void main(String[] args) {
        /*
        이것도 주석
        삼항연산자
        항목이 3개
        (조건식) ? 참일때 : 거짓일 때
        - 조건식은 반드시 true or false를 반환
        - 비교 / 논리연산자를 주로 사용
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(num + " 은/는 " + result + " 입니다.");

    }
}

package com.kh.day02.variable;

public class Exam_Comparison {
    public static void main(String[] args) {
        System.out.println("비교연산자 예제");
        /* 1<2, 3<2, 1==2, 1 != 1
            T   F    F      F
            비교연산자 : 두 값을 비교하는 연산자, 관계 연산자
            비교연산자는 조건을 만족하면 true, 아니면 false
         */

        int num1 = 50;
        int num2 = 30;
        boolean result = num1 < num2;
        System.out.println("num1 < num2 의 결과 : " + result );
        result = num1 > num2;
        System.out.println("num1 > num2 의 결과 : " + result );
        result = num1 == num2;
        System.out.println("num1 == num2 의 결과 : " + result );
        result = num1 != num2;
        System.out.println("num1 != num2 의 결과 : " + result );

        int num = 2;
        result = num % 2 ==1;
        System.out.println(result );
    }
}

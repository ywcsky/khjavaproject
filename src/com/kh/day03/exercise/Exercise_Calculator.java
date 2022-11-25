package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        System.out.print("정수를 입력해주세요. : ");
        int input1 = sc.nextInt();
        System.out.print("정수를 한번더 입력해주세요 : ");
        int input2 = sc.nextInt();
        System.out.print("연산자를 입력해주세요(+,-,*,/,%) : ");
        char operator = sc.next().charAt(0);
        if (operator == '+'){
            result = input1 + input2;
        } else if (operator == '-') {
            result = input1 - input2;
        }else if (operator == '*'){
            result = input1 * input2;
        } else if (operator == '/') {
            result = input1 / input2;
        } else if (operator == '%') {
            result = input1 % input2;
        }

        System.out.println("결과 : " + input1 + " " + operator + " " + input2 + " = " +result);
    }
}

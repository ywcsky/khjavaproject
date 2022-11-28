package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_CalculatorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; ; i++) {
            System.out.print("정수 입력 1 : ");
            int num1 = sc.nextInt();
            System.out.print("정수 입력 2 : ");
            int num2 = sc.nextInt();
            System.out.print("연산자 입력(+,-,*,/,%) : ");
            char cal = sc.next().charAt(0);

            switch (cal) {
                case '+':
                    System.out.println("결과 : " + num1 + num2);
                    break;
                case '-':
                    System.out.println("결과 : " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("결과 : " + num1 * num2);
                    break;
                case '/':
                    System.out.println("결과 : " + num1 / num2);
                    break;
                case '%':
                    System.out.println("결과 : " + num1 % num2);
                    break;
                default:
                    System.out.println("올바른 연산자를 입력하시오.");
            }
            System.out.print("계속 진행 여부(Y or N) : ");
            char con = sc.next().charAt(0);
            if (con == 'N' || con=='n') break;
        }
    }
}

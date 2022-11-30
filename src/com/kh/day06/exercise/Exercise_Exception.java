package com.kh.day06.exercise;

import javax.security.sasl.SaslClient;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
    public void Exception1() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int num1 = 0, num2 = 0;
                System.out.print("나뉨수를 입력하시오 : ");
                num1 = sc.nextInt();
                System.out.print("나눗수를 입력하시오 : ");
                num2 = sc.nextInt();
                System.out.printf("%d를 %d로 나누면 %d입니다.", num1, num2, num1 / num2);
                break;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌수 없습니다. 다시 입력하세요.");
            }
        }
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num1 = 0;

        System.out.println("정수 3개를 입력하세요. : ");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " >> ");
            try {
                num1 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("올바른 정수를 입력하세요.");
                sc.next();  // 입력된 문자 제거
                i--;        // 반복 횟수 차감
                continue;   // 아랫라인 스킵
                         }
            sum += num1;
        }
        System.out.println("합은 : " + sum);
    }
}

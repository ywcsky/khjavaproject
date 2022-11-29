package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_For {
    public void exercise1() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            if (i == 10) {
                System.out.print(i + " = ");
            } else {
                System.out.print(i + " + ");
            }
        }
        System.out.print(sum);
    }

    public void exercise2() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            if (i == 10) {
                System.out.print(i + " = ");
            } else {
                System.out.print(i + " + ");
            }
        }
        System.out.print(sum);
    }

    public void exercise3() {
        for (int i = 1; i < 10; i++) {
            System.out.println(2 + " x " + i + " = " + 2 * i);
        }
    }

    public void exercise4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        if (num > 0 && num < 10) {
            for (int i = 1; i < 10; i++) {
                System.out.println(num + " x " + i + " = " + num * i);
            }
        } else {
            System.out.println("1~9사이의 양수를 입력하여야 합니다.");
        }
    }
}

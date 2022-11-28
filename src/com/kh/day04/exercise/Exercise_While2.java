package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        while(true) {
            int num2 = 1;
            if (num > 0 && num < 10) {
                System.out.println("===" + num + "단===");
                while (num2 < 10) {
                    System.out.println(num + " x " + num2 + " = " + num * num2);
                    num2++;
                }
            }
        }
    }
}

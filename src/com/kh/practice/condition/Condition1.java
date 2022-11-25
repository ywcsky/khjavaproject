package com.kh.practice.condition;

import java.util.Scanner;

public class Condition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력하고 싶은 단수 입력 : ");
        int num1 = sc.nextInt();
        System.out.println("=====" + num1 + "단=====");
        for (int i = 1; i < 10; i++){
            System.out.println(num1 + " * " + i + " = " + num1+i);
        }
    }
}

package com.kh.practice.condition;

import java.util.Scanner;

public class Condition4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 1 : ");
        int num1 = sc.nextInt();
        System.out.print("정수 2 : ");
        int num2 = sc.nextInt();
        System.out.print("입력 : ");
        int num3 = sc.nextInt();

        if(num1 < num2) {
            boolean result = (num1 >= num3 || num2 < num3) ? true : false;
            System.out.println(result);
        } else{
            System.out.println("정수1은 정수2 보다 작아야한다.");
        }


    }
}

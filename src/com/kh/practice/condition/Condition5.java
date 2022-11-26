package com.kh.practice.condition;

import java.util.Scanner;

public class Condition5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력1 : ");
        int num1 = sc.nextInt();
        System.out.print("입력2 : ");
        int num2 = sc.nextInt();
        System.out.print("입력3 : ");
        int num3 = sc.nextInt();
        boolean result = (num1 == num2 && num1 == num3) ? true:false;
        System.out.println(result);

    }
}

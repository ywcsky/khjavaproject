package com.kh.practice.condition;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int num = sc.nextInt();

        for (int i = 0; i < num+1; i++){
            for (int j=0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

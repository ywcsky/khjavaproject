package com.kh.practice.condition;

import java.util.Scanner;

public class Condition10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++){
            for (int j = num; i < j; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

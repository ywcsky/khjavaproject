package com.kh.practice.condition;

import java.util.Scanner;

public class Condition12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int num2 = num;

        for (int i = 1;i < num+1; i++){
            for (int j = num; j > 0; j--){
                if (i<j){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        if(num > 0 && num < 10){
            for (int i = 1; i < 10; i++){
                System.out.println(num + " x " + i + " = " + num*i);
            }
        }else {
            System.out.println("1~9사이의 양수를 입력하여야 합니다.");
        }
    }
}
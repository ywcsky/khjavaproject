package com.kh.day02.excercise;

import java.util.Scanner;

public class Excercise_Logical1 {
    public static void main(String[] args) {
        /* 50이 1~100사이의 숫자인지 확인하세요!
           50을 num에 넣어 초기화
           1~100사이의 숫자인가? true
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. : ");
        int num = sc.nextInt();
        boolean result;
        result = (num <= 1) && (num <= 100);
        System.out.println("입력한 숫자는 1~100사이의 숫자 인가? : " + result);

    }
}
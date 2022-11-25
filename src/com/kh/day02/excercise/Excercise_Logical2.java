package com.kh.day02.excercise;

import java.util.Scanner;

public class Excercise_Logical2 {
    public static void main(String[] args) {
        /* 문자 A가 대문자인지 소문자인지 확인하세요.
           단, A라는 문자는 변수 word에 초기화
           영어 대문자 확인 : true
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력해주세요 : ");
        char word = sc.next().charAt(0);
        boolean result = (word >= 65) && (word <= 90);
        System.out.println("word에 담겨있는 글자가 대문자 인가? : " + result);
    }
}
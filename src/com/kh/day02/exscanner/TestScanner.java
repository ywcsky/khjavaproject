package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("int 값을 입력해주세요 : ");
        int input = sc.nextInt();
        System.out.println("입력한 값 : " + input);

        System.out.print("int 값을 입력해주세요 : ");
        int input2 = sc.nextInt();
        System.out.println("입력한 값 : " + input2);

        int result = input + input2;
        System.out.println("두 값의 합은 : " + result + " 입니다.");
    }
}

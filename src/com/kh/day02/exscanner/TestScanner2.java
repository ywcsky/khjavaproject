package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력해주세요 : ");
        int iNum = sc.nextInt();
        System.out.print("실수를 입력해주세요 : ");
        double dNum = sc.nextDouble();
        System.out.print("문자열을 입력해주세요 : ");
        String words = sc.next();
        System.out.print("문자를 입력해주세요 : ");
        char word = sc.next().charAt(0);

        System.out.println("입력한 정수는 : " + iNum);
        System.out.println("입력한 실수는 : " + dNum);
        System.out.println("입력한 문자열은 : " + words);
        System.out.println("입력한 문자는 : " + word);


    }
}

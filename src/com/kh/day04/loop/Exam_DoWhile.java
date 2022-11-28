package com.kh.day04.loop;

import java.util.Scanner;

public class Exam_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do{
            System.out.print("정수 입력 : ");
            num = sc.nextInt();
        } while (num != 1);
    }
}

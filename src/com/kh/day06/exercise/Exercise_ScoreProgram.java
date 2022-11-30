package com.kh.day06.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_ScoreProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int kor = 0, eng = 0, math = 0, choice;
        while (true) {
            System.out.println("==== 메인 메뉴 ====");
            System.out.println("1. 성적입력");
            System.out.println("2. 성적출력");
            System.out.println("3. 종료");
            System.out.print("선택 : ");
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("메뉴 중 하나를 입력 해주세요.");
                sc.next();
                continue;
            }
            try {
                if (choice == 1) {
                    System.out.println("==== 성적 입력 ====");
                    System.out.print("국어 : ");
                    kor = sc.nextInt();
                    System.out.print("영어 : ");
                    eng = sc.nextInt();
                    System.out.print("수학 : ");
                    math = sc.nextInt();
                    System.out.println();
                }
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력 해주세요.");
                sc.next();
                continue;
            }if (choice == 2) {
                double avr = (kor + eng + math) / 3;
                System.out.println("==== 성적 출력 ====");
                System.out.println("국어 : " + kor);
                System.out.println("영어 : " + eng);
                System.out.println("수학 : " + math);
                System.out.println();
                System.out.println("총점 : " + (kor + eng + math));
                System.out.printf("평균 : %.2f \n", avr);
                System.out.println();
            } else if (choice == 3) {
                System.out.println();
                System.out.println("Good Bye~");
                break;
            } else {
                System.out.println("메뉴 중 하나를 입력 해주세요.");
            }

        }
    }
}

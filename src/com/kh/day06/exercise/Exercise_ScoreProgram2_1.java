package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram2_1 {
    static int kor = 0;
    static int eng = 0;
    static int math = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GOHOME:
        while (true) {
            printMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inputScore();
                    break;
                case 2:
                    printScore();
                    break;
                case 3:
                    goodByeMsg();
                    break GOHOME;
                default:
                    printException();
                    break;

            }
        }
    }

    public static void printMenu() {
        System.out.println("====== 메인 메뉴 ======");
        System.out.println("1. 성적입력");
        System.out.println("2. 성적출력");
        System.out.println("3. 종료");
        System.out.print("선택 : ");
    }

    public static void inputScore() {
        System.out.println("====== 성적 입력 =======");
        System.out.print("국어 : ");
        kor = sc.nextInt();
        System.out.print("영어 : ");
        eng = sc.nextInt();
        System.out.print("수학 : ");
        math = sc.nextInt();
    }
    public static void printScore(){
        int sum = kor + eng + math;
        double avg = (double) sum / 3;
        System.out.println("====== 성적 출력 ======");
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + math);
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f \n", avg);
    }
    public static void goodByeMsg(){
        System.out.println("Good Bye~~");
    }
    public static void printException(){
        System.out.println("1~3사이의 숫자를 입력하세요.");
    }
}

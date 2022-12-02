package com.kh.day07.score;

import java.util.Scanner;

public class ScoreFuntion {
    private int kor, eng, math;
    Scanner sc = new Scanner(System.in);

    public ScoreFuntion() {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int printMenu() {
        System.out.println("====== 메인 메뉴 ======");
        System.out.println("1. 성적입력");
        System.out.println("2. 성적출력");
        System.out.println("3. 종료");
        System.out.print("선택 : ");
        int choice = sc.nextInt();
        return choice;
    }

    public void inputScore() {
        System.out.println("====== 성적 입력 =======");
        System.out.print("국어 : ");
        kor = sc.nextInt();
        System.out.print("영어 : ");
        eng = sc.nextInt();
        System.out.print("수학 : ");
        math = sc.nextInt();
    }

    public void printScore() {
        int sum = kor + eng + math;
        double avg = (double) sum / 3;
        System.out.println("====== 성적 출력 ======");
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + math);
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f \n", avg);
    }

    public void goodByeMsg() {
        System.out.println("Good Bye~~");
    }

    public void exceptionMsg() {
        System.out.println("1~3사이의 숫자를 입력하세요.");
    }
}

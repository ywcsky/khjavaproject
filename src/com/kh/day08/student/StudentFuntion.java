package com.kh.day08.student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentFuntion {
    Scanner sc = new Scanner(System.in);
    Student[] students;
    private int menu;

    public StudentFuntion() {
        students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }
    }

    public int printMenu() {
        System.out.println("==== 학생 성적 확인 프로그램 ====");
        System.out.println("1. 학생 성적 입력");
        System.out.println("2. 학생 성적 출력");
        System.out.println("3. 재평가 여부 확인");
        System.out.println("4. 프로그램 종료");
        System.out.print("선택 : ");
        try {
            menu = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("1~3사이의 숫자를 입력하시오.");
            sc.next();
        }
        return menu;
    }

    public void inputScore() {
        System.out.println("======= 학생 성적 입력 =======");
        for (int i = 0; i < students.length; i++) {
            System.out.println("==== " + (i + 1) + "번째 학생 성적 입력 ====");
            System.out.print("학생 이름 입력 : ");
            students[i].setName(sc.next());
            System.out.print("1차 점수 입력 : ");
            students[i].setFirstScore(sc.nextInt());
            System.out.print("2차 점수 입력 : ");
            students[i].setSecondScore(sc.nextInt());
        }
    }

    public void printScore() {
        System.out.println("==== 학생 성적 출력 ====");
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 : " + students[i].getName());
            System.out.println("1차 점수 : " + students[i].getFirstScore() + ", 2차 점수 : " + students[i].getSecondScore());
            System.out.println("======================");
        }
    }

    public void checkPass() {
        /**
         * 0. 재평의 여부는 1차, 2차가 각각 다르다.
         * 1. 각각의 점수가 40점 미만의 경우 과락으로 재평가 대상자가 된다. 한 과목만 40점 미만인 경우
         *    1, 2차 평균이 60점 이상이면 40점 미만인 과목만 재평가를 본다.
         * 3. 1차 점수와 2차 점수의 평균은 60점을 넘어야 한다.
         * 4. 1차 점수와 2차 점수의 평균이 60점 미만의 경우 60점 미만의 과목에 대해서 재평가를 본다.
         */

        for (int i = 0; i < students.length; i++) {
            int avg = (students[i].getFirstScore() + students[i].getSecondScore()) / 2, num1 = students[i].getFirstScore(), num2 = students[i].getSecondScore();
            String name = students[i].getName();

            if (avg > 60) {
                if (num2 < 40) {
                    System.out.println("학생 " + name + " 은 2차 시험 재평가 대상 입니다.");
                } else if (num1 < 40) {
                    System.out.println("학생 " + name + " 은 1차 시험 재평가 대상 입니다.");
                } else {
                    System.out.println("학생 " + name + " 은 시험 재평가 대상이 아닙니다.");

                }
            } else if (avg < 60) {
                if (num2 < 40 && num1 < 40) {
                    System.out.println("학생 " + name + " 은 1차 및 2차 시험 재평가 대상 입니다.");
                } else if (num2 < 60) {
                    System.out.println("학생 " + name + " 은 2차 시험 재평가 대상 입니다.");
                } else if (num1 < 60) {
                    System.out.println("학생 " + name + " 은 1차 시험 재평가 대상 입니다.");
                }
            } else {
                System.out.println("학생 " + name + " 은 재평가 대상이 아닙니다.");
            }
        }
    }

    public void printGoodBye() {
        System.out.println("GoodBye~~");
    }

    public void printException() {
        System.out.println("1~3사이의 숫자를 입력하시오.");

    }


}

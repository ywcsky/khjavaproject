package com.kh.day07.student;

public class StudentFuntion {
    Student student;

    public StudentFuntion() {
        student = new Student();
    }

    /**
     * 학생관리 프로그램 메뉴 출력
     *
     * @return choice
     */

    public int printMenu() {
        System.out.println("====== 학생 성적 관리 프로그램 ======");
        System.out.println("1. 학생 성적 입력");
        System.out.println("2. 학생 성적 출력");
        System.out.println("3. 프로그램 종료");
        System.out.print("선택 : ");
        int choice = student.sc.nextInt();
        return choice;
    }

    public void inputScore() {
        System.out.println("====== 학생 정보 입력 ======");
        System.out.print("학생 이름 입력 : ");
        student.setName(student.sc.next());
        System.out.print("국어점수 입력 : ");
        student.setKor(student.sc.nextInt());
        System.out.print("영어점수 입력 : ");
        student.setEng(student.sc.nextInt());
        System.out.print("수학점수 입력 : ");
        student.setMath(student.sc.nextInt());
    }

    public void printScore() {
        System.out.println("====== 학생 정보 출력 ======");
        System.out.println(student.getName() + "학생의 성적");
        System.out.println("국어 성적 : " + student.getKor());
        System.out.println("영어 성적 : " + student.getEng());
        System.out.println("수학 성적 : " + student.getMath());
        System.out.println("==========================");
    }

    public void goodByeMsg() {
        System.out.println("GoodBye~~");
    }

    public void exceptionMsg() {
        System.out.println("1~3사이의 숫자를 입력하시오.");
    }
}

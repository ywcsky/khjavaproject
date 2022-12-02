package com.kh.day07.student;

import java.util.Scanner;

public class Student {
    private int kor;
    private int eng;
    private int math;
    private String name;

    Scanner sc = new Scanner(System.in);

    public Student() {

    }

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    //setter ↓
    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter ↓
    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public String getName() {
        return name;
    }
}


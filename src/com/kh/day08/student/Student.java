package com.kh.day08.student;

public class Student {
    private int firstScore, secondScore;
    private String name;

    public Student(){
    }

    public Student(String name){
        this.name = name;
    }

    public Student(int firstScore, int secondScore){
        this.firstScore = firstScore;
        this.secondScore = secondScore;
    }

    public Student(String name, int firstScore, int secondScore){
        this.name = name;
        this.firstScore = firstScore;
        this.secondScore = secondScore;
    }

    public int getFirstScore() {
        return firstScore;
    }

    public int getSecondScore() {
        return secondScore;
    }

    public String getName() {
        return name;
    }

    public void setFirstScore(int firstScore) {
        this.firstScore = firstScore;
    }

    public void setSecondScore(int secondScore) {
        this.secondScore = secondScore;
    }

    public void setName(String name) {
        this.name = name;
    }
}

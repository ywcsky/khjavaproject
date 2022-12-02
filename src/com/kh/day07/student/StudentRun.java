package com.kh.day07.student;

public class StudentRun {
    public static void main(String[] args) {
        StudentFuntion sf = new StudentFuntion();
        end:
        while (true) {
            switch (sf.printMenu()){
                case 1 : sf.inputScore();
                break;
                case 2 : sf.printScore();
                break;
                case 3 : sf.goodByeMsg();
                break end;
                default: sf.exceptionMsg();
                break;
            }
        }
    }
}
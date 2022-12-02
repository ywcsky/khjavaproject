package com.kh.day08.student;

public class StudentRun {
    public static void main(String[] args) {
        StudentFuntion sf = new StudentFuntion();
        home:
        while (true) {
            switch (sf.printMenu()) {
                case 1:
                    sf.inputScore();
                    break;
                case 2:
                    sf.printScore();
                    break;
                case 3:
                    sf.checkPass();
                    break;
                case 4:
                    sf.printGoodBye();
                    break home;
                default:
                    sf.printException();
                    break;
            }

        }
    }
}

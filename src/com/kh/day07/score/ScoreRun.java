package com.kh.day07.score;

import java.util.Scanner;

public class ScoreRun {
    public static void main(String[] args) {
        ScoreFuntion sf = new ScoreFuntion(); // 반복문 x
        GOHOME:
        while (true) {
            switch (sf.printMenu()) {
                case 1:
                    sf.inputScore();
                    break;
                case 2:
                    sf.printScore();
                    break;
                case 3:
                    sf.goodByeMsg();
                    break GOHOME;
                default:
                    sf.exceptionMsg();
                    break;
            }
        }
    }
}

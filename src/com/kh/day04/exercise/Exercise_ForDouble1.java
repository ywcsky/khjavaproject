package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ForDouble1 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.print(i + " x " + j + " = " + i*j);
                System.out.print('\t');
            }
            System.out.println();

        }
    }
}

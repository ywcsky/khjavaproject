package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {
    public static void main(String[] args) {
        Random rand = new Random();
        int cont = 0;
        for (int i = 0; i < 5000; i++) {
            int a = rand.nextInt(14);
            if(a == 13){
                System.out.println(a);
                cont += 1;
            }

        }
        System.out.println(cont);
    }
}

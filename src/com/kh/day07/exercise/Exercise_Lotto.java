package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
    public void lottoProgram() {
        Random r = new Random();
        int[] lottoNumber = new int[6];

        for (int i = 0; i < lottoNumber.length; i++) {
            lottoNumber[i] = r.nextInt(45) + 1;
            for(int j = 0; j < i; j++) {
                if (lottoNumber[j] == lottoNumber[i]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < lottoNumber.length - 1; i++) {
            for (int j = 0; j < (lottoNumber.length - 1) - i; j++) {
                if (lottoNumber[j] > lottoNumber[j + 1]) {
                    int temp = lottoNumber[j + 1];
                    lottoNumber[j + 1] = lottoNumber[j];
                    lottoNumber[j] = temp;
                }
            }
        }

        for (int i = 0; i < lottoNumber.length; i++) {
            System.out.print(lottoNumber[i] + " ");
        }

    }
}

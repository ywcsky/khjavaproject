package com.kh.practice.condition;

import java.util.Scanner;

public class Condition8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력하고 싶은 단수 입력 : ");
        int dan = sc.nextInt();

        for (int i = dan; i <= 9; i++){
            System.out.println("===="+ i + "단====");
            for (int j = 1; j <= 9; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
}

package com.kh.day04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String coin = "";
        while (true) {
            System.out.println("==== 동전 앞 뒤 맞추기 ====");
            System.out.print("숫자를 입력해주세요. (1.앞면 / 2.뒷면) : ");
            int input = sc.nextInt();
            int computer = rand.nextInt(2) + 1;

            if(computer == 1){
                coin = "앞면";
            }else {
                coin = "뒷면";
            }

            System.out.println("컴퓨터 : " + coin);
            if (input == computer) {
                System.out.println("맞췄습니다.");
            } else {
                System.out.println("틀렸습니다.");
            }
        }
    }
}

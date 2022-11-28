package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        while(true) {
            System.out.print("정수 하나 입력 : ");
            num = sc.nextInt();
            if(num == -1){
                break;
            }else {
                sum += num;
            }
        }
        System.out.print("입력하신 수의 합은 : " + sum);
    }
}

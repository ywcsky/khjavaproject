package com.kh.practice.condition;

import java.util.Scanner;

public class Condition9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하시오 : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++){
            System.out.print(i);
            if(i < num){
                System.out.print(" + ");
            }
            sum += i;
        }
        System.out.print(" = " + sum);
    }
}

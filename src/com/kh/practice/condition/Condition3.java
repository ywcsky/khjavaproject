package com.kh.practice.condition;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하시오 : ");
        int num = sc.nextInt();

        if(num >= 1){
            for (int i = 1; i <= num; i++){
                System.out.print(i + " ");
            }
        }else {
            System.out.println("1이상의 수를 입력하시오.");
        }
    }
}

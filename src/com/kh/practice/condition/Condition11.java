package com.kh.practice.condition;

import java.util.Scanner;

public class Condition11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자 : ");
        int num2 = sc.nextInt();


        if(num1 < 1 || num2 < 1){
            System.out.println("1이상의 숫자를 입력해주세요.");
        }else{
            if(num1 < num2){
                for (int i = num1; i <= num2; i++){
                    System.out.print(num1 + " ");
                    num1++;
                }
            } else if (num2 < num1) {
                for (int i = num2; i <= num1; i++){
                    System.out.print(num2 + " ");
                    num2++;
                }
            }else {
                System.out.println(num1);
            }
        }
    }
}

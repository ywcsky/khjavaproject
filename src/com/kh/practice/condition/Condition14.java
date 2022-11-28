package com.kh.practice.condition;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Condition14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        for (int i = 0; i <= num+1; i++){
            if(i == num-num || i == num) {
                for (int j = 0; j <= num; j++) {
                    System.out.print("*");
                }
            }
           for (int j = 1; j < num; j++){
               System.out.println();
               if(j==num-num+1 || j == num){
                   System.out.print("*");

               }System.out.print(" ");

           }

        }
    }
}

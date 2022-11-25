package com.kh.practice.operator;

import java.util.Scanner;

public class Operator3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 : ");
        int num = sc.nextInt();

        if (num > 0){
            System.out.println("양수다.");
        }else if(num <0 ){
            System.out.println("음수다.");
        }else{
            System.out.println("0");
        }
    }
}

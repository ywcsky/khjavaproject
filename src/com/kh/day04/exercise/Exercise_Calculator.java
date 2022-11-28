package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 1 : ");
        int num1 = sc.nextInt();
        System.out.print("정수 입력 2 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자 입력(+,-,*,/,%) : ");
        char cal = sc.next().charAt(0);

        switch (cal){
            case '+' :
                System.out.println("결과 : " + num1+num2);
                break;
            case '-' :
                System.out.println("결과 : " + (num1-num2));
                break;
            case '*' :
                System.out.println("결과 : " + num1 * num2);
                break;
            case '/' :
                System.out.println("결과 : " + num1/num2);
                break;
            case '%' :
                System.out.println("결과 : " + num1%num2);
                break;
        }
    }
}

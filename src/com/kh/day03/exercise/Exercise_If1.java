package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
    //정수하나를 입력반아서 양의 정수인지, 0인지, 음의정수인지 판별하시오
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");
        int input = sc.nextInt();
        String result = "";
        if (input == 0) {
            result = "0";
        } else if ((input * 2) > -1) {
            result = "양의 정수";
        } else {
            result = "음의 정수";
        }
        System.out.println(input + " 은/는 " + result + " 입니다.");
    }
}

package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("0. 종료");
        System.out.print("메뉴 번호를 입력하세요 : ");
        int choice = sc.nextInt();
        String chose = "";

        switch (choice){
            case 1 : chose = "입력";
            break;
            case 2 : chose = "수정";
            break;
            case 3 : chose = "조회";
            break;
            case 4 : chose = "삭제";
            break;
            case 0 : chose = "종료";
            break;
            default:
                System.out.println("0 ~ 4 사이의 숫자를 입력하세요.");
        }
        System.out.println(chose + "메뉴입니다.");

    }
}

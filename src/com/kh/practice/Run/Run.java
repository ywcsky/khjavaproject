package com.kh.practice.Run;

import com.kh.practice.oop.practice.RSP;
import com.kh.practice.practice.Array;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Array ar = new Array();
        // ar.Arr();
        // ar.Arr2();
        // ar.arr3();

        Scanner sc = new Scanner(System.in);

        while (true) {
            RSP r = new RSP();
            System.out.println("=== 가위 바위 보 게임 시작 ===");
            System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
            r.setUserInput(sc.next());
            System.out.println("당신은 " + r.getUserInput() + "를 냈습니다.");
            System.out.println("컴퓨터는 " + r.getComInput() + "를 냈습니다.");
            r.getResult();
        }

    }
}


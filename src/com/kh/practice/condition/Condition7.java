package com.kh.practice.condition;

import java.util.Scanner;

public class Condition7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A사원의 연봉 : ");
        int a = sc.nextInt();
        System.out.print("B사원의 연봉 : ");
        int b = sc.nextInt();
        System.out.print("C사원의 연봉 : ");
        int c = sc.nextInt();
        char ch = 65;

        while(true) {
            if (ch == 'A') {
                int sum = 0;
                double a1 = a+((double) a * 0.4);
                System.out.println(ch + "사원의 연봉/연봉+a : " + a + "/" + (((double)a*0.4)+a));
                sum += a + a1;
                String add = sum > 3000 ? "3000 이상" : "3000 미만";
                System.out.println(add);
            } else if (ch == 'B') {
                int sum = 0;
                double b1 = (double) b;
                System.out.println(ch + "사원의 연봉/연봉+a : " + b +"/"+(double)b);
                sum += b1;
                String add = sum > 3000 ? "3000 이상" : "3000 미만";
                System.out.println(add);
            } else if (ch=='C') {
                int sum = 0;
                double c1 =+ (double) c * 0.15;
                System.out.println(ch + "사원의 연봉/연봉+a : " + c +"/"+(((double)c*0.15)+c));
                sum += c + c1;
                String add = sum > 3000 ? "3000 이상" : "3000 미만";
                System.out.println(add);
                break;
            }
            ++ch;
        }

    }
}
